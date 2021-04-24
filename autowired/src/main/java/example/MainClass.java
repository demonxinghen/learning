package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author demonxinghen
 * @description the differences between autowired and resource
 */
@ComponentScan
public class MainClass {

    @Autowired
    private MyController myController;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainClass.class);

        for(String beanName : context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

        MainClass mainClass = context.getBean(MainClass.class);

        // 名称装配, 自动装配成功
        mainClass.myController.test();

        System.out.println("---------------------");

        //TODO 名称装配, 自动装配失败, 事实装配成功, 不知道是不是因为@Bean中autowire属性过时的原因
        mainClass.myController.test1();

        System.out.println("######################");

        // 属性装配, 自动装配成功
        mainClass.myController.test2();

        System.out.println("---------------------");

        // 属性装配, 自动装配失败
        mainClass.myController.test3();
    }
}
