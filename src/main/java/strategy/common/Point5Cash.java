package strategy.common;

/**
 * @author jianweilin
 * @date 2018/7/27
 */
public class Point5Cash implements RecvCash {
    private double discount;

    public Point5Cash(double discount) {
        this.discount = discount;
    }

    @Override
    public double returnCash(double totalPrice) {
        return discount * totalPrice;
    }
}
