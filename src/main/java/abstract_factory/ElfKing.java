package abstract_factory;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public class ElfKing implements King {
    static final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
