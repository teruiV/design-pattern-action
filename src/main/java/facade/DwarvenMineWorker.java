package facade;

/**
 * @author jianweilin
 * @date 2018/8/4
 */
public abstract class DwarvenMineWorker {

    public void goToSleep() {
        System.out.println(String.format("%s go to sleep", name()));
    }

    public void wakeUp() {
        System.out.println(String.format("%s go to wake up", name()));
    }

    public void goHome() {
        System.out.println(String.format("%s go home", name()));
    }

    public void goToMine() {
        System.out.println(String.format("%s go to mine", name()));
    }

    private void action(Action action) {
        switch (action){
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                throw new IllegalArgumentException("undefined action.");

        }
    }

    public void action(Action... actions){
        for(Action action: actions){
            action(action);
        }
    }

    static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK;
    }

    protected abstract void work();

    protected abstract String name();
}
