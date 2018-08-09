package builder;

import com.alibaba.fastjson.JSON;

import static builder.Armor.CLOTHES;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
public class App {
    public static void main(String[] args) {
       Hero hero = new Hero.Builder().armor(CLOTHES).hairColor(HairColor.RED)
               .profession(Profession.PRIEST).weapon(Weapon.AXE).build();

        System.out.println(String.format("my hero is %s", JSON.toJSONString(hero)));
    }
}
