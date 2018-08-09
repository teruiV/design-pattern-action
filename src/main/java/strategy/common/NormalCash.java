package strategy.common;

/**
 * @author jianweilin
 * @date 2018/7/27
 */
public class NormalCash implements RecvCash {
    private double discount;

    public NormalCash( double discount) {
        this.discount = discount;
    }

    @Override
    public double returnCash(double totalPrice) {
        return totalPrice * discount;
    }
}
