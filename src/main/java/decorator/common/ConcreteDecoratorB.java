package decorator.common;

/**
 * @author jianweilin
 * @date 2018/7/29
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("concrete decorator b operating....");
    }

    private void addBehavior(){
        System.out.println("this is concreteDecorator b operate");
    }
}
