package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author demonxinghen
 * @description
 */
@Component
public class MyController {

    @Autowired
    private MyService myService;

    @Autowired
    private MyService myService1;

    @Autowired
    private YourService yourService;

    @Autowired
    private YourService yourService1;

    /**
     * autowired默认使用name注入,也就是默认就是myService
     */
    public void test(){
        myService.say();
    }

    /**
     * 此时使用的name是myService1, 不是默认的, 那么这时候就会装配失败
     */
    public void test1(){
        myService1.say1();
    }

    /**
     * autowired指定使用type注入
     */
    public void test2(){
        yourService.say();
    }

    /**
     * autowired指定使用type注入
     */
    public void test3(){
        yourService1.say1();
    }
}
