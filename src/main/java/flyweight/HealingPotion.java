package flyweight;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class HealingPotion implements Potion {
    @Override
    public void drink() {
        System.out.println(String.format("You feel healed. (Potion=%d)",System.identityHashCode(this)));
    }
}
