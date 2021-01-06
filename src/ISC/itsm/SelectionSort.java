//TERMINADO
package ISC.itsm;

public class SelectionSort extends Array {
    public SelectionSort(int[] array){
        super(array);
    }
    public void ordenar(){
        for(int i = 0; i < tam - 1; i++){
            int min = i;
            for(int j = i + 1; j < tam; j++){
                if(array[j] < array[min])
                    min = j;
            }
            if(min != i)
                swap(min, i);
        }
    }
}
