package example.second;

import org.springframework.stereotype.Controller;

/**
 * @author demonxinghen
 * @description
 */
@Controller
public class MyController {

    public MyController(){
        System.out.println("我是使用@ComponentScan + @Component|@Service|@Controller|@Repository的controller");
    }
}
