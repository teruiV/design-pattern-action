package strategy.common;

/**
 * @author jianweilin
 * @date 2018/7/27
 */
public class Point8Cash implements RecvCash {
    private double discount;

    public Point8Cash(double discount) {
        this.discount = discount;
    }

    @Override
    public double returnCash(double totalPrice) {
        return totalPrice * discount;
    }
}
