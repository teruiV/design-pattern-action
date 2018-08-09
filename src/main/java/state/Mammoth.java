package state;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class Mammoth {
    private State state;

    public Mammoth() {
        this.state = new PeacefulState(this);
    }

    public void timePasses(){
        if(state.getClass().equals(PeacefulState.class)){
            changeStateTo(new AngryState(this));
        }else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState){
        this.state = newState;
        this.state.onEnterState();
    }

    public void observe(){
        this.state.observe();
    }


    @Override
    public String toString() {
        return "the mammoth";
    }
}
