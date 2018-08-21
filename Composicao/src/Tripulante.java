
public class Tripulante {
	
	private Pessoa pessoa;
	private int idTripulacao;
	private String nome;
	private String endereco;
	
	public Tripulante(Pessoa pessoa, int idTripulacao) {
		
		this.pessoa = pessoa;
		this.idTripulacao = idTripulacao;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public int getIdTripulacao() {
		return idTripulacao;
	}
	
	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}


	public String getNome() {
		return pessoa.getNome();
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
