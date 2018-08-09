package bridge;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class FlyingEnchantment implements Enchantment {
    @Override
    public void onActive() {
        System.out.println("The item begins to glow faintly.");
    }

    @Override
    public void apply() {
        System.out.println("The item flies and strikes the enemies finally returning to owner's hand.");
    }

    @Override
    public void onDeactive() {
        System.out.println("The item's glow fades.");
    }
}
