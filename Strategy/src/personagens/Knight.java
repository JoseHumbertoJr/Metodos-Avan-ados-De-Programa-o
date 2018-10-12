package personagens;

import armas.WeaponBehavior;

public class Knight extends Character{

	public Knight(Character character) {
		super(character);
	}
	
	@Override
	public String fight(WeaponBehavior weapon) {
		return weapon.useWeapon();
	}
}
