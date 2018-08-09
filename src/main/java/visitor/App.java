package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class App {

    public static void main(String[] args) {
        Commander commander =
                new Commander(new Sergeant(new Soldier(), new Soldier(), new Soldier()), new Sergeant(
                        new Soldier(), new Soldier(), new Soldier()));
        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}

