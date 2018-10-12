package personagens;

import armas.WeaponBehavior;

public class Queen extends Character {

	
	public Queen(Character character) {
		super(character);
	}
	
	public String fight(WeaponBehavior weapon) {
		return weapon.useWeapon();
	}

}
