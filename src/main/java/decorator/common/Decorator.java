package decorator.common;

/**
 * @author jianweilin
 * @date 2018/7/29
 */
public class Decorator implements Component {
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
