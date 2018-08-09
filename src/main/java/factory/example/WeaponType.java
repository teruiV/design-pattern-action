package factory.example;

/**
 * @author jianweilin
 * @date 2018/8/1
 */
public enum WeaponType {
    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINE("");
    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
