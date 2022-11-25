
public class NoLista {
	private Object valor;
	private NoLista prox;
	
	public NoLista(Object valor) {
		this.valor = valor;
		this.prox = null;
	}
	
	public Object getValor() {
		return valor;
	}
	
	public NoLista getProx() {
		return prox;
	}
	
	public void setProx(NoLista prox) {
		this.prox = prox;
	}
	
	public String toString() {
		return "" + valor;
	}
}
