package abstractFactory;


class PizzaStoreAF {

  public abstract class PizzaIngredientBuilder {
	  
	  protected PizzaProduct pizzaria = new PizzaProduct();
	  public abstract void createDough();
	  public abstract void createSauce();
	  public abstract void createCheese();
	  public abstract void createVeggies();
	  public abstract void createPepperoni();
	  public abstract void createClam();
  	
	  public PizzaProduct getPizza() {
		  return pizzaria;
	  }

  }

  // Concrete Factory
  public class ChicagoPizzaIngredientBuilder extends PizzaIngredientBuilder {

	@Override
	public void createDough() {
		this.pizzaria.createCheese = "limão";
	}

	@Override
	public void createSauce() {
		this.pizzaria.createSauce = "temperada";
		
	}

	@Override
	public void createCheese() {
		this.pizzaria.createCheese = "original";
	}

	@Override
	public void createVeggies() {
		this.pizzaria.createVeggies = "batata";
		
	}

	@Override
	public void createPepperoni() {
		this.pizzaria.createPepperoni = "italiano";
	}

	@Override
	public void createClam() {
		this.pizzaria.createClam = "japones";
	}

    	
  }
  ///
  public class NyPizzaIngredientBuilder extends PizzaIngredientBuilder {
	@Override
	public void createDough() {
		this.pizzaria.createCheese = "limão";
	}

	@Override
	public void createSauce() {
		this.pizzaria.createSauce = "temperada";
			
	}

	@Override
	public void createCheese() {
		this.pizzaria.createCheese = "original";
	}

	@Override
	public void createVeggies() {
		this.pizzaria.createVeggies = "batata";
			
	}

	@Override
	public void createPepperoni() {
		this.pizzaria.createPepperoni = "italiano";
	}

	@Override
	public void createClam() {
		this.pizzaria.createClam = "japones";
	}
  
 
  public class FreshClams implements IgredientesBuilder {

  	public String toString() {
  		return "Fresh Clams from Long Island Sound";
  	}
  }

  public class ReggianoCheese implements VeggiesBuilder {

  	public String toString() {
  		return "Reggiano Cheese";
  	}
  }
  
  public class Spinach implements VeggiesBuilder{
	  public String toString() {
	  		return "Spinach";
	  	}
  }
  public class BlackOlives implements VeggiesBuilder{
	  public String toString() {
	  		return "Black Olives";
	  	}
  }
  public class Eggplant implements VeggiesBuilder{
	  public String toString() {
	  		return "Eggplant,";
	  	}
  }
  

  public class MarinaraSauce implements IgredientesBuilder {
	  public String toString() {
	    return "Marinara Sauce";
	  }
  }

  public class ThinCrustDough implements IgredientesBuilder {
  	public String toString() {
  		return "Thin Crust Dough";
  	}
  }
  
  public class MassaRuiva implements IgredientesBuilder {
	  	public String toString() {
	  		return "Massa Ruivo";
	  	}
	  }
  

  public class SlicedPepperoni implements IgredientesBuilder {
    public String toString() {
      return "Sliced Pepperoni";
    }
  }
  
  public class LinguicaFull implements IgredientesBuilder {
	  public String toString() {
		  return "Linguica Full";
	  }
	    }
  }
  }
