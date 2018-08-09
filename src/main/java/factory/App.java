package factory;

/**
 * @author jianweilin
 * @date 2018/7/31
 */
public class App {

    public static void factory(){
        double add = new AddFactory().getResult(10,2);
        double sub = new SubFactory().getResult(10,2);
        double mul = new MulFactory().getResult(10,2);
        double div = new DivFactory().getResult(10,2);
        System.out.println(String.format("add = %.2f,sub = %.2f,mul = %.2f,div = %.2f",add,sub,mul,div));
    }

    public static Operation simpleFactory(String label){
        switch (label){
            case "+":
                return new AddFactory();
            case "-":
                return new SubFactory();
            case "*":
                return new MulFactory();
            case "/":
                return new DivFactory();
            default:
                throw new IllegalArgumentException(String.format("无此标签:%s",label));
        }
    }
    public static void main(String[] args) {

    }
}
