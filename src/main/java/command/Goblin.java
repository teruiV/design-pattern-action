package command;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class Goblin extends Target {
    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
