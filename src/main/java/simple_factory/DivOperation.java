package simple_factory;

/**
 * @author jianweilin
 * @date 2018/7/22
 */
public class DivOperation implements Operation {
    @Override
    public double getResult(int numa,int numb) {

        if (numb == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }
        return numa / numb;
    }
}
