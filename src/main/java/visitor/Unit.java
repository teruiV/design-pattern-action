package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public abstract class Unit {
    private Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVistor vistor){
        for (Unit child: children){
            child.accept(vistor);
        }
    }
}
