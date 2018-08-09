package abstract_factory;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public class OrcCastle implements Castle {
    static final String DESCRIPTION = "This is the Orc castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
