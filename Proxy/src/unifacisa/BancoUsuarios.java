package unifacisa;

public interface BancoUsuarios {
	public int quantidadeDeUsuarios = (int) (Math.random() * 100);;
	public int usuariosConectados = (int) (Math.random() * 10);


	public static String getNumeroDeUsuarios() {
		return new String("Total de usu�rios: " + quantidadeDeUsuarios);
	}

	public static String getUsuariosConectados() {
		return new String("Usu�rios conectados: " + usuariosConectados);
	}
}
