
public class Main {
	
	public static void main(String[] args) {
		
		Pessoa vitao66 = new Pessoa();
		vitao66.setNome("bitones");
		
		Tripulante vitao = new Tripulante(vitao66, 2123);
		
		System.out.println(vitao66.getNome());
		
		vitao.setNome("bitão");
		
		System.out.println(vitao.getNome());
	}

}
