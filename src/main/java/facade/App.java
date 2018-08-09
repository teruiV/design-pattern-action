package facade;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public class App {
    public static void main(String[] args) {
        DwarvenGoldMineFacade facade = new DwarvenGoldMineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
