package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class SergeantVisitor implements UnitVistor {
    @Override
    public void visitSoldier(Soldier soldier) {

    }

    @Override
    public void visitSergrant(Sergeant sergeant) {
        System.out.println(String.format("Hello %s",sergeant));
    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
