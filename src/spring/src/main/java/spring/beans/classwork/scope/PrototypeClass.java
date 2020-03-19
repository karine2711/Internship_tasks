package spring.beans.classwork.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = "prototype")
public class PrototypeClass {

    @PostConstruct
    public void init() {
        System.out.println("prototype @PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("prototype @PreDestroy");
    }
}
