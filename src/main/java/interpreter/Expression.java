package interpreter;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public abstract class Expression {
    public abstract int interpret();

    @Override
    public abstract String toString();
}
