package observe;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public class App {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Hobbits());
        weather.addObserver(new Orcs());

        weather.timePass();
        weather.timePass();
        weather.timePass();
        weather.timePass();
    }
}
