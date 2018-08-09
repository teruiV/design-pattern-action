package template;

/**
 * @author jianweilin
 * @date 2018/8/4
 */
public class TestPaperB extends TestPaper {
    public TestPaperB(String studentName) {
        super(studentName);
    }
    @Override
    public String testAnswer1() {
        return "5";
    }

    @Override
    public String testAnswer2() {
        return "9";
    }

    @Override
    public String testAnswer3() {
        return "1";
    }
}
