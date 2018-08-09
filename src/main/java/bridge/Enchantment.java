package bridge;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public interface Enchantment {
    void onActive();

    void apply();

    void onDeactive();
}
