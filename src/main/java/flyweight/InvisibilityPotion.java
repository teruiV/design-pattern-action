package flyweight;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println(String.format("You become invisible. (Potion=%d)",System.identityHashCode(this)));
    }
}
