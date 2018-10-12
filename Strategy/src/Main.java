import armas.KnifeBehavior;
import armas.SwordBehavior;
import personagens.Character;
import personagens.King;

public class Main {

	public static void main(String[] args) {
		
		Character personagem = null;
		King rei = new King(personagem);
		KnifeBehavior knife = new KnifeBehavior();
		System.out.println(rei.fight(knife));
	}

}
