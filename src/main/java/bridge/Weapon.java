package bridge;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public interface Weapon {
    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
