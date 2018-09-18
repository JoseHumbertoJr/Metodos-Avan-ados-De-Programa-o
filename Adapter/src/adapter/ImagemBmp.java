package adapter;

public class ImagemBmp implements Imagem{

	@Override
	public void rabiscosImagem() {
		System.out.println("pintando imagem BMP");
	}

	@Override
	public void mostrarImagem() {
		System.out.println("imagem BMP");
	}

}
