package example;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author demonxinghen
 * @description
 */
@Configuration
public class MyConfiguration {

    /**
     * 指定通过name注入
     * @return
     */
    @Bean(autowire = Autowire.BY_NAME, name = "myService")
    public MyService myService(){
        return new MyService();
    }

    /**
     * 指定通过type注入
     * @return
     */
    @Bean(autowire = Autowire.BY_TYPE)
    public YourService yourService(){
        return new YourService();
    }
}
