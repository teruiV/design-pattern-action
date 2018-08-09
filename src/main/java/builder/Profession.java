package builder;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public enum  Profession {
    WARRIOR,MAGE,PRIEST;

    @Override
    public String toString() {
        return  name().toLowerCase();
    }
}
