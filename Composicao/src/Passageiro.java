
public class Passageiro {
	
	private int numeroSmiles;
	private Pessoa pessoa;
	private String nome;
	private String endereco;
	
	public Passageiro(Pessoa pessoa, int smiles) {
		
		this.pessoa = pessoa;
		this.numeroSmiles = smiles;
	}
	
	public int getNumeroSmiles() {
		return numeroSmiles;
	}
	public void setNumeroSmiles(int numeroSmiles) {
		this.numeroSmiles = numeroSmiles;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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
