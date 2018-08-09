package decorator.action;

/**
 * ConcreteComponent
 * @author jianweilin
 * @date 2018/7/29
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("light up the body,just wear clothes,please!");
    };
}
