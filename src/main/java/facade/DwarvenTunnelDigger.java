package facade;

/**
 * @author jianweilin
 * @date 2018/8/4
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker{
    @Override
    protected void work() {
        System.out.println(String.format("%s creates another promising tunnel.",name()));
    }

    @Override
    protected String name() {
        return "Dwarven tunnel digger";
    }
}
