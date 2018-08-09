package facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public class DwarvenGoldMineFacade {
    private List<DwarvenMineWorker> workers;

    public DwarvenGoldMineFacade() {
        workers = new ArrayList<>();
        workers.add(new DwarvenGoldDigger());
        workers.add(new DwarvenTunnelDigger());
        workers.add(new DwarvenCartOperator());
    }

    public void startNewDay(){
        makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold(){
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }

    public void endDay(){
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME,DwarvenMineWorker.Action.GO_TO_SLEEP);
    }

    private static void makeActions(Collection<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions){
        for(DwarvenMineWorker work: workers){
            work.action(actions);
        }
    }
}
