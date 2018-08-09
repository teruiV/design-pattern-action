package builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author jianweilin
 * @date 2018/8/5
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public final class Hero {
    private Profession profession;
    private HairColor hairColor;
    private Weapon weapon;
    private Armor armor;

    @Data
    static class Builder{
        private Profession profession;
        private HairColor hairColor;
        private Weapon weapon;
        private Armor armor;

        public Builder profession(Profession profession){
            this.setProfession(profession);
            return this;
        }

        public Builder hairColor(HairColor hairColor){
            this.setHairColor(hairColor);
            return this;
        }

        public Builder weapon(Weapon weapon){
            this.setWeapon(weapon);
            return this;
        }

        public Builder armor(Armor armor){
            this.setArmor(armor);
            return this;
        }

        public Hero build(){
            return new Hero(this.profession,this.hairColor,this.weapon,this.armor);
        }
    }
}
