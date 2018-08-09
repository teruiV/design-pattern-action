package builder;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public enum  HairColor {
    BLUE, BLACK, RED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
