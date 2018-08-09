package bridge;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class SoulEatingEnchantment implements Enchantment {
    @Override
    public void onActive() {
        System.out.println("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        System.out.println("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactive() {
        System.out.println("Bloodlust slowly disappears.");
    }
}
