package state;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public interface State {
    void onEnterState();
    void observe();
}
