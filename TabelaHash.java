
public class TabelaHash {
	private NoArvore[] tabela;
	private int tamanho;
	
	public TabelaHash(int maxTam) {
		tabela = new NoArvore[maxTam];
		tamanho = 0;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public NoArvore[] getTabela() {
		return tabela;
	}
	
	private int funcaoHash(int chave) {
		int hash = 7;
    	for(int i=0; i < chave; i++) {
    		hash = hash*61 + chave;
    	}
    	
    	if(hash < 0) return (hash%tabela.length) + tabela.length - 1;
    	else return (hash % tabela.length);
	}
	
	public NoArvore busca(int chave) {
		int hash = funcaoHash(chave);
		
		NoArvore noAtual = tabela[hash];
		
		while(noAtual != null && noAtual.getChave() != chave) {
			if(chave < noAtual.getChave()) noAtual = noAtual.getEsquerda();
			else noAtual = noAtual.getDireita();
		}
		
		return noAtual;
	}
	
	public boolean insere(int chave, Object valor) {
		NoArvore noAtual = tabela[funcaoHash(chave)];
		if(noAtual == null) {
			tabela[funcaoHash(chave)] = new NoArvore(chave,valor);
			tamanho++;
			return true;
		}
		
		NoArvore noPai;
			
		do {
			noPai = noAtual;
			if(chave < noAtual.getChave()) noAtual = noAtual.getEsquerda();
			else if(chave > noAtual.getChave()) noAtual = noAtual.getDireita();
			else {
				return noAtual.insereLista(valor);
			}
		} while(noAtual != null);
		
		NoArvore noNovo = new NoArvore(chave, valor);
		if(chave < noPai.getChave()) noPai.setEsquerda(noNovo);
		else noPai.setDireita(noNovo);
		tamanho++;
		
		return true;
	}
	
	public String caminhaIdentado(NoArvore subArvore, int identacao) {
		String str = "";
		if(subArvore == null) return str;
		
		for(int i=0; i<identacao; i++) str += "  ";
		
		str += subArvore.toString() + "\n";
		caminhaIdentado(subArvore.getEsquerda(), identacao+1);
		caminhaIdentado(subArvore.getDireita(), identacao+1);
		
		return str;
	}
	
	public String toString() {
		String str = "";
		for(int i=0; i<tabela.length;i++) {
			str += "Posição " + i + " da tabela:\n";
			if(tabela[i] != null) {
				str += caminhaIdentado(tabela[i], 0);
			}
		}
		return str;
	}
}
