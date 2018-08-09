package decorator.action;

/**
 * Decorator
 * @author jianweilin
 * @date 2018/7/29
 */
public class Finery extends Person {
    private Person component;

    public void setComponent(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }
    }
}
