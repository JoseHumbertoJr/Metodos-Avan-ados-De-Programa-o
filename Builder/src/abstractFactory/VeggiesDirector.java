package abstractFactory;

public class VeggiesDirector {
	
	protected VeggiesBuilder veggies;
	
	public VeggiesDirector(VeggiesBuilder veggies) {
		this.veggies = veggies;
	}
	
	public void inserirVeggies() {
		veggies.toString();
	}

}
