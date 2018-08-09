package factory.example;

/**
 * @author jianweilin
 * @date 2018/8/1
 */
public class OrcWeapon implements Weapon {
    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Orcish: " + weaponType;
    }
}
