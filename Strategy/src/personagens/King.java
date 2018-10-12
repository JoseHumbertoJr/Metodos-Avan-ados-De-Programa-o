package personagens;

import armas.WeaponBehavior;

public class King extends Character{

	public King(Character character) {
		super(character);
	}

	public String fight(WeaponBehavior weapon) {
		return weapon.useWeapon();
	}
}
