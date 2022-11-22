import java.util.Scanner;

class No {
    public int elemento; // Conteudo do no.
    public No esq, dir;  // Filhos da esq e dir.

    public No(int elemento) {
        this(elemento, null, null);
    }

    public No(int elemento, No esq, No dir) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

public class ArvoreBinaria {
    public No raiz; // Raiz da arvore.

	public ArvoreBinaria() {
		raiz = null;
	}

	public boolean pesquisar(int x) {
		return pesquisar(x, raiz);
	}

	private boolean pesquisar(int x, No i) {
      boolean resp;
		if (i == null) {
         resp = false;

      } else if (x == i.elemento) {
         resp = true;

      } else if (x < i.elemento) {
         resp = pesquisar(x, i.esq);

      } else {
         resp = pesquisar(x, i.dir);
      }
      return resp;
	}

	public void caminharCentral() {
		System.out.print(" ");
		caminharCentral(raiz);
		System.out.println("");
	}

	private void caminharCentral(No i) {
		if (i != null) {
			caminharCentral(i.esq); // Elementos da esquerda.
			System.out.print(i.elemento + " "); // Conteudo do no.
			caminharCentral(i.dir); // Elementos da direita.
		}
	}

	public void caminharPre() {
		System.out.print(" ");
		caminharPre(raiz);
		System.out.println(" ");
	}

	private void caminharPre(No i) {
		if (i != null) {
			System.out.print(i.elemento + " "); // Conteudo do no.
			caminharPre(i.esq); // Elementos da esquerda.
			caminharPre(i.dir); // Elementos da direita.
		}
	}

	public void caminharPos() {
		System.out.print(" ");
		caminharPos(raiz);
		System.out.println(" ");
	}

	private void caminharPos(No i) {
		if (i != null) {
			caminharPos(i.esq); // Elementos da esquerda.
			caminharPos(i.dir); // Elementos da direita.
			System.out.print(i.elemento + " "); // Conteudo do no.
		}
	}

	public void inserir(int x) throws Exception {
		raiz = inserir(x, raiz);
	}

	private No inserir(int x, No i) throws Exception {
		if (i == null) {
         i = new No(x);

      } else if (x < i.elemento) {
         i.esq = inserir(x, i.esq);

      } else if (x > i.elemento) {
         i.dir = inserir(x, i.dir);

      } else {
         throw new Exception("Erro ao inserir!");
      }

		return i;
	}

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        int quantidade = scanner.nextInt();
        int a=1;
        while (a<=quantidade){
            ArvoreBinaria arvore = new ArvoreBinaria();
            int numElementos = scanner.nextInt();

            for (int i=0; i<numElementos; i++){
                int elemento = scanner.nextInt();
                arvore.inserir(elemento);
            }
            System.out.println("Case "+ a + ":");
            System.out.print("Pre.:");
            arvore.caminharPre();

            System.out.print("In..:");
            arvore.caminharCentral();

            System.out.print("Post:");
            arvore.caminharPos();

            a++;

        }
    }
}
