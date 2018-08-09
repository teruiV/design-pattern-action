package decorator.common;

/**
 * @author jianweilin
 * @date 2018/7/29
 */
public class ConcreateComponent implements Component {
    @Override
    public void operation() {
        System.out.println("concrete object operate");
    }
}
