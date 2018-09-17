package unifacisa;

public class BancoProxy implements BancoUsuarios{

		protected String usuario, senha;

		public BancoProxy(String usuario, String senha) {
			this.usuario = usuario;
			this.senha = senha;
		}

		public String getNumeroDeUsuarios() {
			if (temPermissaoDeAcesso()) {
				return getNumeroDeUsuarios();
			}
			return null;
		}

		public String getUsuariosConectados() {
			if (temPermissaoDeAcesso()) {
				return getUsuariosConectados();
			}
			return null;
		}

		private boolean temPermissaoDeAcesso() {
			return usuario == "admin" && senha == "admin";
		}
}
