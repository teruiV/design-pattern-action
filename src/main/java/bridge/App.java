package bridge;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class App {
    public static void main(String[] args) {
        System.out.println("The knight receives an enchanted sword.");
        Sword enchantmentSword = new Sword(new SoulEatingEnchantment());
        enchantmentSword.wield();
        enchantmentSword.swing();
        enchantmentSword.unwield();

        System.out.println("\nThe valkyrie receives an enchanted hammer.");
        Hammer enchantmentHammer = new Hammer(new FlyingEnchantment());
        enchantmentHammer.wield();
        enchantmentHammer.swing();
        enchantmentHammer.unwield();
    }
}
