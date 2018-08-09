package decorator.common;

/**
 * @author jianweilin
 * @date 2018/7/29
 */
public class ConcreteDecoratorA extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addBehavor();
        System.out.println("concrete decorator operating a!");
    }

    private void addBehavor(){
        System.out.println("conreteDecoratorA object content ....");
    }
}
