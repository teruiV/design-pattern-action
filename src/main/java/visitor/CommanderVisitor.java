package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class CommanderVisitor implements UnitVistor {
    @Override
    public void visitSoldier(Soldier soldier) {

    }

    @Override
    public void visitSergrant(Sergeant sergeant) {

    }

    @Override
    public void visitCommander(Commander commander) {
        System.out.println(String.format("Good to see you %s",commander));
    }
}
