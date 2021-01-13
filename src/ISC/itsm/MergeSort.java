//TERMINADO
package ISC.itsm;

public class MergeSort extends Array {
    public MergeSort(int[] array){
        super(array);
    }

    public void ordenar(){
        mergeSort(0, tam - 1);
    }

    public void mergeSort(int ini, int fin){
        if(ini < fin){
            int mid = (ini + fin) / 2;
            for(int i = 0; i < ini; i++)
                moves += "\t";
            moves += stringArray(array, ini, mid + 1, false);
            moves += stringArray(array, mid + 1, fin + 1, true);
            mergeSort(ini, mid);
            mergeSort(mid + 1, fin);
            merge(ini, mid, fin);

            for(int i = 0; i < ini; i++)
                moves += "\t";
            moves += stringArray(array, ini, fin + 1, true);
        }
    }

    public void merge(int ini, int mid, int fin){
        int n1 = mid - ini + 1;
        int n2 = fin - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++)
            L[i] = array[ini + i];
        for(int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];

        int i = 0, j = 0;
        int k = ini;
        while(i < n1 && j < n2){
            if(L[i] < R[j])
                array[k++] = L[i++];
            else
                array[k++] = R[j++];
        }

        while(i < n1)
            array[k++] = L[i++];
        while(j < n2)
            array[k++] = R[j++];
    }
}
