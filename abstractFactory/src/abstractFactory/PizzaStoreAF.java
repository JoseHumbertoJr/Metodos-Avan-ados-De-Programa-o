package abstractFactory;


class PizzaStoreAF {

  public interface PizzaIngredientFactory {

  	public Dough createDough();
  	public Sauce createSauce();
  	public Cheese createCheese();
  	public Veggies[] createVeggies();
  	public Pepperoni createPepperoni();
  	public Clams createClam();

  }

  // Concrete Factory
  public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    	public Dough createDough() {
    		return new ThinCrustDough();
    	}

    	public Sauce createSauce() {
    		return new MarinaraSauce();
    	}

    	public Cheese createCheese() {
    		return new ReggianoCheese();
    	}

    	public Veggies[] createVeggies() {
    		Veggies veggies[] =  {new BlackOlives(), new Spinach(), new Eggplant()} ;
    		
    		return veggies;
    	}

    	public Pepperoni createPepperoni() {
    		return new SlicedPepperoni();
    	}

    	public Clams createClam() {
    		return new FreshClams();
    	}
  }
  ///
  public class NyPizzaIngredientFactory implements PizzaIngredientFactory {

  	public Dough createDough() {
  		return new MassaRuiva();
  	}

  	public Sauce createSauce() {
  		return new MarinaraSauce();
  	}

  	public Cheese createCheese() {
  		return new ReggianoCheese();
  	}

  	public Veggies[] createVeggies() {
  		Veggies veggies[] =  {
  				new BlackOlives(), new Spinach(), new Eggplant()} ;
  		
  		return veggies;
  	}

  	public Pepperoni createPepperoni() {
  		return new LinguicaFull();
  	}

  	public Clams createClam() {
  		return new FreshClams();
  	}
  }

  
  // Parts of Pizza
  public interface Clams {
	   public String toString();
  }
  

  public interface Cheese {
	   public String toString();
  }

  public interface Sauce {
	    public String toString();
  }

  public interface Dough {
  	public String toString();
  }

  public interface Pepperoni {
  	public String toString();
  }

  public class FreshClams implements Clams {

  	public String toString() {
  		return "Fresh Clams from Long Island Sound";
  	}
  }

  public class ReggianoCheese implements Cheese {

  	public String toString() {
  		return "Reggiano Cheese";
  	}
  }
  
  public class Spinach implements Veggies{
	  public String toString() {
	  		return "Spinach";
	  	}
  }
  public class BlackOlives implements Veggies{
	  public String toString() {
	  		return "Black Olives";
	  	}
  }
  public class Eggplant implements Veggies{
	  public String toString() {
	  		return "Eggplant,";
	  	}
  }
  

  public class MarinaraSauce implements Sauce {
	  public String toString() {
	    return "Marinara Sauce";
	  }
  }

  public class ThinCrustDough implements Dough {
  	public String toString() {
  		return "Thin Crust Dough";
  	}
  }
  
  public class MassaRuiva implements Dough {
	  	public String toString() {
	  		return "Massa Ruivo";
	  	}
	  }
  

  public class SlicedPepperoni implements Pepperoni {
    public String toString() {
      return "Sliced Pepperoni";
    }
  }
  
  public class LinguicaFull implements Pepperoni {
	    public String toString() {
	      return "Linguica Full";
	    }
	  }
}