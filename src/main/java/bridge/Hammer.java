package bridge;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class Hammer implements Weapon {
    private Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The hammer is wielded.");
        enchantment.onActive();
    }

    @Override
    public void swing() {
        System.out.println("The hammer is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("The hammer is unwielded.");
        enchantment.onDeactive();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
