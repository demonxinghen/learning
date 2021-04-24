package example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author demonxinghen
 * @description 实现InitializingBean和DisposableBean
 */
@Component
public class ImplementLifeCycle implements InitializingBean, DisposableBean {

    public ImplementLifeCycle(){
        System.out.println("我是实现类的构造方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("我是实现类的init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("我是实现类的destroy");
    }
}
