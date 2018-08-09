package mediator;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public enum Action {
    HUNT("hunted a rabbit", "arrives for dinner"), TALE("tells a tale", "comes to listen"), GOLD(
            "found gold", "takes his share of the gold"), ENEMY("spotted enemies", "runs for cover"), NONE(
            "", "");

    private String title;
    private String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title;
    }
}
