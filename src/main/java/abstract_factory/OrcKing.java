package abstract_factory;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public class OrcKing implements King {
    static final String DESCRIPTION = "This is the Orc king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
