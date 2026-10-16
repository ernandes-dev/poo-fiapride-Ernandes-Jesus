package br.com.fiapride.model;

public class Ebook extends Livro{
	
		private double tamanhoArquivoMB;
		
		public Ebook(double tamanhoArquivoMB, String titulo, int quantidadeDePaginas, String generoLiterario, Autor autor) {
			
			super(titulo, quantidadeDePaginas, generoLiterario, autor);
			
			this.setTamanhoArquivoMB(tamanhoArquivoMB);
		}
		public double getTamanhoArquivoMB() {
			
			return this.tamanhoArquivoMB;
		}
		private void setTamanhoArquivoMB(double tamanhoArquivoMB) {
			
			this.tamanhoArquivoMB = tamanhoArquivoMB;
		}
		@Override
		public String exibirDetalhes() {
		    return super.exibirDetalhes()
		            + "\nTamanho do arquivo: " + this.getTamanhoArquivoMB() + " MB";
		}

}


