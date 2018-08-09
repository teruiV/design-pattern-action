//package strategy.common;
//
//import com.alibaba.fastjson.JSON;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 使用工厂模式
// *
// * @author jianweilin
// * @date 2018/7/27
// */
//public class Common {
//    private static final List<String> DESC_LIST = new ArrayList<>();
//    private static final String DESC_PATTRN = "单价：%f 数量:%d %s 合计: %f";
//
//    public static double recvCash(double totalCash, Discount discount) {
//        int label = discount.getLab();
//        double point = discount.getDiscountPoint();
//        switch (label) {
//            case 1:
//                return new NormalCash().returnCash(totalCash, point);
//            case 2:
//                return new Point8Cash().returnCash(totalCash, point);
//            case 3:
//                return new Point7Cash().returnCash(totalCash, point);
//            case 4:
//                return new Point5Cash().returnCash(totalCash, point);
//            default:
//                return new NormalCash().returnCash(totalCash, point);
//
//        }
//    }
//
//    public static List<String> buy(double price, int count, Discount discount) {
//        double totalCash = recvCash(price * count,discount);
//        String singleBuyDesc = String.format(DESC_PATTRN,price,count,discount.getDesc(),totalCash);
//        DESC_LIST.add(singleBuyDesc);
//        return DESC_LIST;
//    }
//
//    public static void reset(){
//        DESC_LIST.clear();
//    }
//
//    public static void test_001(){
//        buy(101.99,10,Discount.NORMAL);
//        buy(103.99,20,Discount.POINT_8);
//        buy(104.99,30,Discount.POINT_7);
//        buy(105.99,40,Discount.POINT_5);
//        System.out.println(String.format("desc list = %s", JSON.toJSONString(DESC_LIST)));
//        reset();
//        System.out.println(String.format("desc list = %s", JSON.toJSONString(DESC_LIST)));
//    }
//
//    public static void main(String[] args) {
//        test_001();
//    }
//}
