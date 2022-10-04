public class metodos {

    public static void selecao (int [] array) {
        int n = array.length;
        for (int i=0; i<(n-1); i++){
            int menor = i;
            for (int j=(i+1); j<n; j++){
                if (array[menor] > array[j]){
                    menor = j;
                }
            }
            swap (i, menor, array);
        }
    }

    public static void selecaoParcial (int [] array, int k) {
        int n = array.length;
        for (int i=0; i<k; i++){
            int menor = i;
            for (int j=(i+1); j<n; j++){
                if (array[menor] > array[j]){
                    menor = j;
                }
            }
            swap (i, menor, array);
        }
    }

    public static void insercao (int [] array){
        int n = array.length;
        for (int i=1; i<n; i++){
            int aux = array[i];
            int j = i-1;
            while ((j>=0) && (array[j] > aux)){
                array[j+1] = array[j];
                j--; 
            }
            array[j+1] = aux;
        }
    }
    //3, 14, 1, 7, 13, 9, 10, 12, 8, 2, 4, 5, 6, 15
    public static void insercaoParcial (int [] array, int k){
        int n = array.length;
        for (int i=1; i<n; i++){
            int aux = array[i];
            int j=(i<k) ? i-1 : k; //se i<k, faça j=i-1, se não faça j=k-1
            while((j>=0) && (array[j]>aux)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = aux;
        }
    }

    public static void swap (int i, int menor, int []array){
            int aux = array[i];
            array[i] = array[menor];
            array[menor] = aux;
    }

    public static void main(String[] args) {
        int [] array = {3, 14, 1, 7, 13, 9, 10, 12, 8, 0, 2, 4, 5, 6, 15};
        insercaoParcial(array, 3);
        System.out.println("\nInserção Parcial (k=5): ");
        System.out.print("[ ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }

}
