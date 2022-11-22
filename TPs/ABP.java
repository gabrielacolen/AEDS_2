import java.util.Scanner;

class No {
    public char elemento; // Conteudo do no.
    public No esq, dir;  // Filhos da esq e dir.

    public No(char elemento) {
        this(elemento, null, null);
    }

    public No(char elemento, No esq, No dir) {
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

	public boolean pesquisar(char x) {
		return pesquisar(x, raiz);
	}

	private boolean pesquisar(char x, No i) {
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

	public void inserir(char x) throws Exception {
		raiz = inserir(x, raiz);
	}

	private No inserir(char x, No i) throws Exception {
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

    public static void inserirOuPesquisar(String s, ArvoreBinaria arvore) throws Exception{
        if(s.charAt(0) == 'I'){
            arvore.inserir(s.charAt(2));
        }
        else{
            boolean resp = false;
            resp = arvore.pesquisar(s.charAt(2));
            if (resp) System.out.println("existe");
            else System.out.println("nao existe");
        }
        
    }

    public static void mostrar (char letra, ArvoreBinaria arvore){
        switch (letra) {
            case 'N':
                arvore.caminharCentral();
                break;
            case 'R':
                arvore.caminharPre();
                break;
            case 'O':
                arvore.caminharPos();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        ArvoreBinaria arvore = new ArvoreBinaria();
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            if (s.charAt(1) == ' '){
                inserirOuPesquisar(s, arvore);
            }
            else{
                mostrar(s.charAt(1), arvore);
            }
        }

    }
}
