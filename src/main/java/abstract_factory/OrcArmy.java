package abstract_factory;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public class OrcArmy implements Army {
    static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
