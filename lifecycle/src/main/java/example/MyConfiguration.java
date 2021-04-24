package example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author demonxinghen
 * @description
 */
@Configuration
public class MyConfiguration {

    @Bean(initMethod = "destroy", destroyMethod = "init")
    public BeanLifeCycle beanLifeCycle(){
        return new BeanLifeCycle();
    }
}
