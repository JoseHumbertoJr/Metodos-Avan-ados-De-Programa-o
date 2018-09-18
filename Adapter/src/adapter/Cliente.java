package adapter;

public class Cliente {
	
	public static void main(String[] args) {
		
		Imagem imagemJpeg = new ImagemJpeg();
		ImagemAdapter imagemAdapterJpeg = new ImagemAdapter(imagemJpeg);
		imagemJpeg.mostrarImagem();
		System.out.println(" ");
		imagemAdapterJpeg.carregarImagem();
		
	}

}
