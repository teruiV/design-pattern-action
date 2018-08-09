package template;

/**
 * @author jianweilin
 * @date 2018/8/4
 */
public class TestPaperA extends TestPaper {

    public TestPaperA(String studentName) {
        super(studentName);
    }

    @Override
    public String testAnswer1() {
        return "3";
    }

    @Override
    public String testAnswer2() {
        return "6";
    }

    @Override
    public String testAnswer3() {
        return "7";
    }
}
