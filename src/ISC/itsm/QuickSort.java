//TERMINADO
package ISC.itsm;

public class QuickSort extends Array {
    public QuickSort(int[] array){
        super(array);
    }

    public void ordenar() {
        quickSort(0, tam - 1);
    }

    public void quickSort(int ini, int fin){
        if(ini < fin) {
            int p = partir(ini, fin);
            for(int i = 0; i < ini; i++)
                moves += "\t";
            moves += stringArray(array, ini, p, false) +
                    stringArray(array, p, p + 1, false) +
                    stringArray(array, p + 1, fin + 1, true);
            quickSort(ini, p - 1);
            quickSort(p + 1, fin);
        }
    }

    public int partir(int ini, int fin){
        int min = ini - 1;
        int p = array[fin];
        for(int j = ini; j < fin; j++){
            if(array[j] < p){
                swap(++min, j);
            }
        }
        swap(fin, min + 1);
        return min + 1;
    }
    /*
    public int pivot(int ini, int fin){
        int mid = (ini + fin) / 2;
        if((array[ini] > array[mid] && array[ini] < array[fin]) || (array[ini] > array[fin] && array[ini] < array[mid]))
            return ini;
        if((array[fin] > array[mid] && array[fin] < array[ini]) || (array[fin] > array[ini] && array[fin] < array[mid]))
            return fin;
        return mid;
    }
     */
}
