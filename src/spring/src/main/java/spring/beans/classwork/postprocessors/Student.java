package spring.beans.classwork.postprocessors;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
    private String name;

    public Student() {
        System.out.println("constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setter");
        this.name = name;
    }

    public void initInXml(){
        System.out.println("initINXml");
    }

    public  void destroyInXml(){
        System.out.println("dstroyInXml");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConst");
    }

@PreDestroy
    public void preDestroy(){
    System.out.println("pre destroy");
}
}
