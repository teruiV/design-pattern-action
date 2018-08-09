package proxy;

/**
 * @author jianweilin
 * @date 2018/7/30
 */
public class App {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("李娇娇");
        Proxy william = new Proxy(girl);
        william.giveDolls();
        william.giveFlowers();
        william.giveChocolate();
    }
}
