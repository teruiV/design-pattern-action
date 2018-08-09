package abstract_factory;

import lombok.Data;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
@Data
public class App {
    private King king;
    private Castle castle;
    private Army army;

    public void createKingdom(final KingdomFactory factory){
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    public static void main(String[] args) {
        App app = new App();
        app.createKingdom(new ElfKingdomFactory());
        System.out.println(String.format("army = %s, castle = %s, king = %s\n", app.getArmy().getDescription(),app.getCastle().getDescription(),app.getKing().getDescription()));
        app.createKingdom(new OrcKingdomFactory());
        System.out.println(String.format("army = %s, castle = %s, king = %s", app.getArmy().getDescription(),app.getCastle().getDescription(),app.getKing().getDescription()));
    }
}
