package flyweight;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class HolyWaterPotion implements Potion {
    @Override
    public void drink() {
        System.out.println(String.format("You feel blessed. (Potion=%d)",System.identityHashCode(this)));
    }
}
