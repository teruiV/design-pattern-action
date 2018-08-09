package decorator.action;

/**
 * @author jianweilin
 * @date 2018/7/29
 */
public class App {
    public static void main(String[] args) {
        Person component = new Person("William");
        TShirts tShirts = new TShirts();
        BigTrouser trouser = new BigTrouser();

        tShirts.setComponent(component);
        trouser.setComponent(tShirts);
        trouser.show();
    }
}
