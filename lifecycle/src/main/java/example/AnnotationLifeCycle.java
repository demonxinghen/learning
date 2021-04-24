package example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author demonxinghen
 * @description @PostConstruct和@PreDestroy
 */
@Component
public class AnnotationLifeCycle {

    public AnnotationLifeCycle(){
        System.out.println("注解constructor");
    }

    @PostConstruct
    public void say(){
        System.out.println("注解init");
    }

    @PreDestroy
    public void hello(){
        System.out.println("注解destroy");
    }
}
