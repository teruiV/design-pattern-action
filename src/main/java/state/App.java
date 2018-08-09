package state;

/**
 * 状态模式
 * @author jianweilin
 * @date 2018/8/7
 */
public class App {
    public static void main(String[] args) {
        Mammoth mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
    }
}
