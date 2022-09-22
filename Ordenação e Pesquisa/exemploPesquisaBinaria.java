class exemploPesquisaBinaria {
    public static boolean pesquisaBinariaIterativa(int[] vetor, int chave) {
        boolean valido = false;
        int n = vetor.length;
        int dir = n-1, esq = 0, meio;
        while(esq <= dir){
            meio = (esq + dir)/2;
            if (chave == vetor[meio]){
                valido = true;
                esq = n;
            }
            else if (chave > vetor[meio]) esq = meio + 1; //a metade de cima será testada
            else dir = meio - 1;                          //a metade de baixo será testada
        }
        return valido;
    }

    public static int pesquisaBinariaRecursiva (int[] vetor, int chave, int esq, int dir){
        int resposta;
        if (esq>dir)  resposta = -1;
        else{
            int meio = (esq + dir)/2;
            if (chave == vetor [meio]) resposta = meio;
            else if (chave > vetor[meio]) resposta = pesquisaBinariaRecursiva (vetor, chave, meio+1, dir);
            else resposta = pesquisaBinariaRecursiva (vetor, chave, esq, meio-1);
        }
        return resposta;
    }
    public static void main(String[] args) {
        int [] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (pesquisaBinariaIterativa(vetor, 0)) System.out.println("SIM");
        else System.out.println("NAO");

        System.out.println("Resultado recursivo = " + pesquisaBinariaRecursiva(vetor, 0, 0, vetor.length- 1));
    }
}
