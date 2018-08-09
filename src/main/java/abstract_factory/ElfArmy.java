package abstract_factory;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public class ElfArmy implements Army {
    static final String DESCRIPTION = "This is the Elven Army!";


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
