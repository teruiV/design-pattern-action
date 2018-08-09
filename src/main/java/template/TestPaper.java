package template;

/**
 * @author jianweilin
 * @date 2018/8/4
 */
public abstract class TestPaper {
    private String studentName;

    public TestPaper(String studentName) {
        this.studentName = studentName;
    }

    public void testQuestion1() {
        System.out.println("试题1：1+2=?");
        System.out.println("试题1答案：" + testAnswer1());
    }

    public void testQuestion2() {
        System.out.println("试题2：3*4=？");
        System.out.println("试题2答案：" + testAnswer2());
    }

    public void testQuestion3() {
        System.out.println("试题3：(5+1)*7=?");
        System.out.println("试题3答案：" + testAnswer3());
    }

    public void dispaly() {
        System.out.println(String.format("学生%s的答卷情况:", this.studentName));
        testQuestion1();
        testQuestion2();
        testQuestion3();
        System.out.println("\n");
    }

    public abstract String testAnswer1();

    public abstract String testAnswer2();

    public abstract String testAnswer3();
}
