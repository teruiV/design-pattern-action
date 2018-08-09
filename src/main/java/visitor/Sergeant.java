package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class Sergeant extends Unit {
    public Sergeant(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVistor vistor) {
        vistor.visitSergrant(this);
        super.accept(vistor);
    }

    @Override
    public String toString() {
        return "Sergeant";
    }
}
