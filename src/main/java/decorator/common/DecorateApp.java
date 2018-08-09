package decorator.common;

/**
 * @author jianweilin
 * @date 2018/7/29
 */
public class DecorateApp {
    public static void main(String[] args) {
        ConcreateComponent c = new ConcreateComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        a.setComponent(c);
        b.setComponent(a);
        b.operation();
    }
}
