
class Celula {
	public int elemento;
	public Celula esq;
	public Celula dir;
    public Celula inf;
    public Celula sup;


	public Celula() {
		this(0);
	}
	public Celula(int elemento) {
		this.elemento = elemento;
		this.dir = this.esq = this.inf = this.sup = null;
	}
}

class Matriz {
    private Celula inicio;
    private int linha, coluna;

    public Matriz(int l, int c){
        this.linha = l;
        this.coluna = c;
    }
    public Matriz (){
        this(3,3);
    }
}
