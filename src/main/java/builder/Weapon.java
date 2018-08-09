package builder;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public enum  Weapon {
    DAGGER, SWORD, AXE, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
