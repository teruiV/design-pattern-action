package adapter;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class App {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishBoatAdapter(new FishBoat()));
        captain.row();
    }
}
