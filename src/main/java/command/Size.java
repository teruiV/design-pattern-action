package command;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public enum Size {
    SMALL("small"),NORMAL("normal"),LARGE("large"),UNDEFINE("undefine");
    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
