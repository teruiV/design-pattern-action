package factory;

/**
 * @author jianweilin
 * @date 2018/7/31
 */
public class DivFactory implements Operation {
    @Override
    public double getResult(double numA, double numB) {
        if(numB == 0.0){
            throw new IllegalArgumentException("除数不能为0");
        }
        return numA / numB;
    }
}
