package abstract_factory;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
