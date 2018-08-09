package factory.example;

/**
 * @author jianweilin
 * @date 2018/8/1
 */
public class OrcBlacksmith implements Blacksmith {

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
