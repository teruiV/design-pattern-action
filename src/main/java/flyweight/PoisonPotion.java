package flyweight;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class PoisonPotion implements Potion {
    @Override
    public void drink() {
        System.out.println(String.format("Urgh! This is poisonous. (Potion=%d)",System.identityHashCode(this)));
    }
}
