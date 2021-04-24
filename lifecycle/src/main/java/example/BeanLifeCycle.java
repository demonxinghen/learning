package example;

/**
 * @author demonxinghen
 * @description
 */
public class BeanLifeCycle {

    public BeanLifeCycle(){
        System.out.println("我是BeanLifeCycle的构造方法");
    }

    private void init() {
        System.out.println("虽然我名字叫init, 但实际上我是destroy");
    }

    private void destroy() {
        System.out.println("虽然我名字叫destroy, 但实际上我是init");
    }
}
