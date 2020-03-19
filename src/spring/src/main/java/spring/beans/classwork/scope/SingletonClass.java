package spring.beans.classwork.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = "singleton")
public class SingletonClass {

    @PostConstruct
    public void init() {
        System.out.println("singleton PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("singleton @PreDestroy");
    }
}