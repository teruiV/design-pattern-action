package strategy.action;

import com.alibaba.fastjson.JSON;
import strategy.common.Discount;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jianweilin
 * @date 2018/7/28
 */
public class App {
    private List<String> result;
    private static final String DESC_PATTRN = "单价：%.2f 数量:%d %s 合计: %.2f";

    public App() {
        result = new ArrayList<>();
    }

    public void initInstance(double price, int count, Discount discount){
        double realCash = new Strategy(discount.getLab()).getRecvCash().returnCash(price * count);
        result.add(String.format(DESC_PATTRN, price,count,discount.getDesc(),realCash));
    }

    public static void main(String[] args) {
        App app = new App();
        app.initInstance(10,10,Discount.NORMAL);
        app.initInstance(10,10,Discount.POINT_8);
        app.initInstance(10,10,Discount.POINT_7);
        app.initInstance(10,10,Discount.POINT_5);
        System.out.println(JSON.toJSONString(app.result));
    }
}
