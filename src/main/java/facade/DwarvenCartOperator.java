package facade;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public class DwarvenCartOperator extends DwarvenMineWorker {
    @Override
    protected void work() {
        System.out.println(String.format("%s moves gold chunks out of the mine.", name()));
    }

    @Override
    protected String name() {
        return "Dwarf cart operator";
    }
}
