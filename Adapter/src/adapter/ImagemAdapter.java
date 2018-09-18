package adapter;

public class ImagemAdapter implements ImagemTarget {
	
	private Imagem imagem;
	

	public ImagemAdapter(Imagem imagem) {
		
		this.imagem = imagem;
	}

	@Override
	public void carregarImagem() {
		// TODO Auto-generated method stub
		this.imagem.mostrarImagem();
		
	}

	@Override
	public void desenharImagem() {
		// TODO Auto-generated method stub
		
	}

}
