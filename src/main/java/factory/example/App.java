package factory.example;

import static factory.example.WeaponType.AXE;
import static factory.example.WeaponType.SHORT_SWORD;

/**
 * @author jianweilin
 * @date 2018/8/1
 */
public class App {
    private final Blacksmith blacksmith;

    public App(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public static void main(String[] args) {
        App app = new App(new OrcBlacksmith());
        app.manufactureWeapons();
        app = new App(new ElfBlacksmith());
        app.manufactureWeapons();
    }

    private void manufactureWeapons(){
        Weapon weapon;
        weapon = blacksmith.manufactureWeapon(SHORT_SWORD);
        System.out.println(weapon.toString());
        weapon = blacksmith.manufactureWeapon(AXE);
        System.out.println(weapon.toString());
    }
}
