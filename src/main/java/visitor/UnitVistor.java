package visitor;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public interface UnitVistor {
    void visitSoldier(Soldier soldier);

    void visitSergrant(Sergeant sergeant);

    void visitCommander(Commander commander);
}
