package state;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class AngryState implements State {
    private Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s is furious!",mammoth.toString()));
    }

    @Override
    public void observe() {
        System.out.println(String.format("%s is angry!",mammoth));
    }
}
