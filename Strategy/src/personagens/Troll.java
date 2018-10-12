package personagens;

import armas.WeaponBehavior;

public class Troll extends Character {

	public Troll(Character character) {
		super(character);
	}

	public String fight(WeaponBehavior weapon) {
		return weapon.useWeapon();
	}
}
