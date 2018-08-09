package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class Soldier extends Unit {
    public Soldier(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVistor vistor) {
        vistor.visitSoldier(this);
        super.accept(vistor);
    }

    @Override
    public String toString() {
        return "Soldier";
    }
}
