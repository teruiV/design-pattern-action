package facade;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {
    @Override
    protected void work() {
        System.out.println(String.format("%s digger for gold.",name()));
    }

    @Override
    protected String name() {
        return "Dwarf gold digger";
    }
}
