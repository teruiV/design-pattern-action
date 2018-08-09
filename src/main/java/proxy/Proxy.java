package proxy;

/**
 * @author jianweilin
 * @date 2018/7/30
 */
public class Proxy implements IGiveGift{
    private Pursuit man;

    public Proxy(SchoolGirl girl) {
        this.man = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        man.giveDolls();
    }

    @Override
    public void giveFlowers() {
        man.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        man.giveChocolate();
    }
}
