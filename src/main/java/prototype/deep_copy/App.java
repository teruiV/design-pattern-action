package prototype.deep_copy;


/**
 * @author jianweilin
 * @date 2018/8/4
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鹏");
        a.setPersonalInfo("男", 29);
        a.setWorkExperience("2015-2018", "达达-京东到家");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2014-2015", "优酷");

        Resume c = (Resume) a.clone();
        c.setWorkExperience("2013-2014", "电信");

        a.dispaly();
        b.dispaly();
        c.dispaly();
    }
}
