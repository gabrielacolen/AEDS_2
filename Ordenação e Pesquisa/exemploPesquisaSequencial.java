class exemploPesquisaSequencial{
    public static boolean pesquisaSequencial(int []vetor, int chave) {
        boolean valido = false;
        int n = vetor.length;
        for (int i=0; i<n; i++){
            if (vetor[i] == chave){
                valido = true;
                i = n; //interrupção no for para parar de continuar buscando
            }
        }
        return valido;
    }
    public static void main(String[] args) {
        int [] vetor = {10, 5, 3, 7, 2, 1, 6, 4, 8};
        if (pesquisaSequencial(vetor, 12)) System.out.println("SIM");
        else System.out.println("NAO");
    }
}