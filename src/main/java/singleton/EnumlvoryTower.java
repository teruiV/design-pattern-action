package singleton;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public enum EnumlvoryTower {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
