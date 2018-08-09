package prototype.deep_copy;

/**
 * @author jianweilin
 * @date 2018/8/4
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private int age;

    private WorkExperience workExperience;


    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    public void setPersonalInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void dispaly() {
        System.out.println(String.format("个人信息：name : %s, sex: %s, age: %d", name, sex, age));
        System.out.println(String.format("工作经历：workData: %s, company: %s \n", workExperience.getWorkDate(), workExperience.getCompany()));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.workExperience);
        obj.name = this.name;
        obj.age = this.age;
        obj.sex = this.sex;
        return obj;
    }
}
