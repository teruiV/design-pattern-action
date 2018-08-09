package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class SoldierVisitor implements UnitVistor {
    @Override
    public void visitSoldier(Soldier soldier) {
        System.out.println(String.format("Greetings %s",soldier));
    }

    @Override
    public void visitSergrant(Sergeant sergeant) {

    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
