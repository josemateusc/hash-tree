
public class HashArvoreListaMain {
	public static void main(String[] args) {
		TabelaHash tabela = new TabelaHash(5);

		tabela.insere(19, "Darwin");
		tabela.insere(31, "Einstein");
		tabela.insere(16, "Galileo");
		tabela.insere(17, "Newton");
		tabela.insere(16, "Kepler");
		tabela.insere(16, "Descartes");
		tabela.insere(17, "Pascal");
		tabela.insere(17, "Hooke");
		tabela.insere(12, "Fibonacci");
		tabela.insere(15, "Copernicus");
		tabela.insere(18, "Watt");
		tabela.insere(46, "Turing");
		tabela.insere(11, "Nye");
		tabela.insere(19, "Schrodinger");
		tabela.insere(11, "deGrasse");
		tabela.insere(15, "daVinci");
		tabela.insere(19, "Curie");
		tabela.insere(18, "Faraday");
		tabela.insere(11, "Sagan");
		tabela.insere(19, "Tesla");
		tabela.insere(76, "Hawking");
		tabela.insere(81, "Heisenberg");
		tabela.insere(61, "Neumann");
		tabela.insere(31, "Shoemaker");
		tabela.insere(31, "Archimedes");
		tabela.insere(46, "Mendel");
		tabela.insere(76, "Mendeleev");
		tabela.insere(76, "Bohr");
		tabela.insere(61, "Ampere");
		tabela.insere(81, "Lavoisier");
		   
		tabela.tamanho();
		tabela.busca(5);
		
		System.out.print(tabela);
	}
}
