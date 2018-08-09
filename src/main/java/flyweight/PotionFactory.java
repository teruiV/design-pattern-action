package flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class PotionFactory {
    private final Map<PotionType,Potion> potions;

    public PotionFactory() {
        potions = new EnumMap<PotionType, Potion>(PotionType.class);
    }

    public Potion createPotion(PotionType type){
        Potion potion = potions.get(type);
        if(potion == null){
            switch (type){
                case HEALING:
                    potion = new HealingPotion();
                    potions.put(type,potion);
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    potions.put(type,potion);
                    break;
                case STRENGTH:
                    potion = new StrengthPotion();
                    potions.put(type,potion);
                    break;
                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    potions.put(type,potion);
                    break;
                case POISON:
                    potion = new PoisonPotion();
                    potions.put(type,potion);
                    break;
                default:
                    break;
            }
        }
        return potion;
    }
}
