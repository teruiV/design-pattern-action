package simple_factory;

/**
 * @author jianweilin
 * @date 2018/7/22
 */
public class AddOperation implements Operation {

    @Override
    public double getResult(int numa,int numb) {
        return numa + numb ;
    }
}
