package interpreter;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class NumberExpression extends Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String s) {
        this.number = Integer.valueOf(s);
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return "number";
    }
}
