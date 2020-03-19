package spring.beans.classwork.customannotations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import spring.beans.classwork.customannotations.annotations.Timer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

@Component
public class TimerBeanPostProcessor implements BeanPostProcessor {
    private Map<String, Class> map = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        if (beanClass.isAnnotationPresent(Timer.class)) {
            map.put(beanName, beanClass);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class beanClass = map.get(beanName);
        if (beanClass != null) {
            InvocationHandler handler = (proxy, method, args) -> {

                long start = System.nanoTime();
                Object retVal = method.invoke(bean, args);
                long end = System.nanoTime();
                System.out.println(method.getName() + " time: " + (end - start));
                return retVal;

            };
            return Proxy.newProxyInstance(bean.getClass().getClassLoader(), beanClass.getInterfaces(), handler);
        }
        return bean;
    }
}