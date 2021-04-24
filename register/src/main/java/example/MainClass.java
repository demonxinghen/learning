package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author demonxinghen
 * @description 将bean加载进spring容器的四种方式
 * 1.@Configuration+@Bean注解
 * 2.@ComponentScan + @Component|@Service|@Controller|@Repository
 * 3.@Import + 具体的某个类|ImportSelector的实现类|MyImportBeanDefinitionRegistrar的实现类
 */
@ComponentScan
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainClass.class);

        for(String beanName : context.getBeanDefinitionNames()){
            if (!beanName.contains("springframework")){
                System.out.println(beanName);
            }
        }
    }
}
