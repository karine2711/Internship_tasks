package spring.beans.classwork.customannotations;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import spring.beans.classwork.customannotations.annotations.InitAge;

import java.lang.reflect.Field;

@Component
public class InitAgeBeanPostProcessor implements BeanPostProcessor {
        @Override
        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

            Field[] fields = bean.getClass().getDeclaredFields();
            for (Field field : fields) {
                InitAge annotation = field.getAnnotation(InitAge.class);
                if (annotation != null) {
                    field.setAccessible(true);
                    ReflectionUtils.setField(field, bean, annotation.value());
                }
            }

            return bean;
        }

        @Override
        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            return bean;
        }
    }


