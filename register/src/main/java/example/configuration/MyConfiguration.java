package example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author demonxinghen
 * @description @Configuration+@Bean注解
 */
@Configuration
public class MyConfiguration {

    @Bean
    public Dog dog(){
        return new Dog();
    }
}
