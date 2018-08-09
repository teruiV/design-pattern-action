package simple_factory;

/**
 * 简单工厂类了；；
 * @author jianweilin
 * @date 2018/7/22
 */
public class App {
    public static Operation createOperation(String operate){
        switch (operate){
            case "+":
                return new AddOperation();
            case "-":
                return new SubOperation();
            case "*":
                return new MulOperation();
            case "/":
                return new DivOperation();
            default:
                throw new IllegalArgumentException("没有此运算符");
        }
    }

    public static void main(String[] args) {
        Operation oper = createOperation("+");
        System.out.println(oper.getResult(1,2));
    }
}
