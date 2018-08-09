package flyweight;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class StrengthPotion implements Potion {
    @Override
    public void drink() {
        System.out.println(String.format("You feel strong. (Potion=%d)",System.identityHashCode(this)));
    }
}
