package strategy.action;

import strategy.common.*;

/**
 * @author jianweilin
 * @date 2018/7/27
 */
public class Strategy {
    private RecvCash recvCash;

    public Strategy(int label) {
        switch (label) {
            case 1:
                recvCash = new NormalCash(Discount.NORMAL.getDiscountPoint());
                break;
            case 2:
                recvCash = new Point8Cash(Discount.POINT_8.getDiscountPoint());
                break;
            case 3:
                recvCash = new Point7Cash(Discount.POINT_7.getDiscountPoint());
                break;
            case 4:
                recvCash = new Point5Cash(Discount.POINT_5.getDiscountPoint());
                break;
            default:
                recvCash = new NormalCash(Discount.NORMAL.getDiscountPoint());
                break;
        }
    }

    public RecvCash getRecvCash() {
        return recvCash;
    }
}
