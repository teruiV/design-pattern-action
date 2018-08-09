package builder;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public enum Armor {
    CLOTHES("clothes"),CHAIN_MAIL("chain mail");

    private String title;

    Armor(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
