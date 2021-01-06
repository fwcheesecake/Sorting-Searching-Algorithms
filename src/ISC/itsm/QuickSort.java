//TERMINADO
package ISC.itsm;

public class QuickSort extends Array {
    public QuickSort(int[] array){
        super(array);
    }

    public void ordenar(){
        quickSort(0, tam);
    }

    public void quickSort(int ini, int fin){
        if(ini < fin){
            int p = partir(ini, fin);
            quickSort(ini, p);
            quickSort(p + 1, fin);
        }
    }

    public int partir(int ini, int fin){
        int min = ini;
        int p = array[tam - 1] ;
        for(int j = ini; j < fin; j++){
            if(array[j] < p){
                swap(min++, j);
            }
        }
        swap(tam - 1, min);
        return min;
    }

    public int pivot(int ini, int fin){
        int mid = (ini + fin) / 2;
        if((array[ini] > array[mid] && array[ini] < array[fin]) || (array[ini] > array[fin] && array[ini] < array[mid]))
            return ini;
        if((array[fin] > array[mid] && array[fin] < array[ini]) || (array[fin] > array[ini] && array[fin] < array[mid]))
            return fin;
        return mid;
    }
}
