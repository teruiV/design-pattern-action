package prototype;

/**
 * @author jianweilin
 * @date 2018/8/4
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private int age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void dispaly() {
        System.out.println(String.format("个人信息：name : %s, sex: %s, age: %d", name, sex, age));
        System.out.println(String.format("工作经历：timeArea: %s, company: %s \n", timeArea, company));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
