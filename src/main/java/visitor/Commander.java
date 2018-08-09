package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class Commander extends Unit {

    public Commander(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVistor vistor) {
        vistor.visitCommander(this);
        super.accept(vistor);
    }

    @Override
    public String toString() {
        return "Commander";
    }
}
