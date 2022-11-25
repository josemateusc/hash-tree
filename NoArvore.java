
public class NoArvore {
	private int chave;
	private NoLista listaTopo;
	private int listaTamanho;
	private NoArvore esquerda;
	private NoArvore direita;
	private NoArvore pai;
	
	public NoArvore(int chave, Object valor) {
		this.chave = chave;
		this.listaTopo = new NoLista(valor);
		this.listaTamanho = 1;
		this.esquerda = null;
		this.direita = null;
		this.pai = null;
	}
	
	public int getChave() {
		return chave;
	}
	
	public NoLista getListaTopo() {
		return listaTopo;
	}
	
	public int getListaTamanho() {
		return listaTamanho;
	}
	
	public NoLista buscaLista(Object valor) {
		NoLista noAtual = listaTopo;
		while(noAtual != null) {
			if(noAtual.getValor().equals(valor)) return noAtual;
			noAtual = noAtual.getProx();
		}
		return null;
	}
	
	public boolean insereLista(Object valor) {
		if(buscaLista(valor) == null) {
			NoLista noAtual = new NoLista(valor);
			noAtual.setProx(listaTopo);
			listaTopo = noAtual;
			listaTamanho++;
			return true;
		}
		return false;
	}
	
	public NoArvore getEsquerda() {
		return esquerda;
	}
	
	public void setEsquerda(NoArvore esquerda) {
		this.esquerda = esquerda;
	}
	
	public NoArvore getDireita() {
		return direita;
	}
	
	public void setDireita(NoArvore direita) {
		this.direita = direita;
	}
	
	public NoArvore getPai() {
		return pai;
	}
	
	public void setPai(NoArvore pai) {
		this.pai = pai;
	}
	
	public String toString() {
		String str  = chave + " - ";
		NoLista noAtual = listaTopo;
		if(noAtual != null) {
			str += noAtual;
			noAtual = noAtual.getProx();
		}
		while(noAtual != null) {
			str += ", " + noAtual.toString();
			noAtual = noAtual.getProx();
		}
		return str;
	}
}
