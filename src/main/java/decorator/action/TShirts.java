package decorator.action;

/**
 * @author jianweilin
 * @date 2018/7/29
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("wear TShirts");
    }
}
