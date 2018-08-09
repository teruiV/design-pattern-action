package singleton;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public final class IvoryTower {
    private IvoryTower() {
    }

    private static final IvoryTower INSTANCE = new IvoryTower();

    public static IvoryTower getInstance() {
        return INSTANCE;
    }
}
