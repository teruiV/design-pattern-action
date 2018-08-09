package state;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class PeacefulState implements State{
    private Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s calm down!",mammoth.toString()));
    }

    @Override
    public void observe() {
        System.out.println(String.format("%s is peaceful!",mammoth.toString()));
    }
}
