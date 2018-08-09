package command;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public enum  Visibility {
    VISIBLE("visible"),INVISIBLE("invisible"),UNDEFINE("");
    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
