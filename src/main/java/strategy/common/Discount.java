package strategy.common;

/**
 * @author jianweilin
 * @date 2018/7/27
 */
public enum Discount {
    NORMAL(1, 1, "正常"),
    POINT_8(2, 0.8, "8折"),
    POINT_7(3, 0.7, "7折"),
    POINT_5(4, 0.5, "5折");
    private int lab;
    private double discountPoint;
    private String desc;

    Discount(int lab, double discountPoint, String desc) {
        this.lab = lab;
        this.discountPoint = discountPoint;
        this.desc = desc;
    }

    public int getLab() {
        return lab;
    }

    public double getDiscountPoint() {
        return discountPoint;
    }

    public String getDesc() {
        return desc;
    }
}
