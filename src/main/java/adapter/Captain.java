package adapter;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class Captain implements RowingBoat {
    private RowingBoat boat;

    public Captain(RowingBoat boat) {
        this.boat = boat;
    }

    @Override
    public void row() {
        boat.row();
    }
}
