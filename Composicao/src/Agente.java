
public class Agente {
	
	private Pessoa pessoa;
	private int idPessoa;
	private String nome;
	private String endereco;
	
	public Agente (Pessoa pessoa, int idPessoa) {
		
		this.pessoa = pessoa;
		this.idPessoa = idPessoa;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return pessoa.getEndereco();
	}

	public void setNome(String nome) {
		this.pessoa.setNome(nome); 
	}

	public String getEndereco() {
		return pessoa.getEndereco();
	}

	public void setEndereco(String endereco) {
		this.pessoa.setEndereco(endereco);
	}

}
