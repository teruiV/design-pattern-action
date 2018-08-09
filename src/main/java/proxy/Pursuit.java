package proxy;

/**
 * @author jianweilin
 * @date 2018/7/30
 */
public class Pursuit implements IGiveGift {
    private SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + "送你洋娃娃~");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + "送你花~");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + "送你巧克力~");
    }
}
