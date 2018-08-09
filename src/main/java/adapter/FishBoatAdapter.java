package adapter;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class FishBoatAdapter implements RowingBoat {
    private FishBoat fishBoat;

    public FishBoatAdapter(FishBoat fishBoat) {
        this.fishBoat = fishBoat;
    }

    @Override
    public void row() {
        this.fishBoat.sail();
    }
}
