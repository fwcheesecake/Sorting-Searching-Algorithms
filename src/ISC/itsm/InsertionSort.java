//terminado
package ISC.itsm;

public class InsertionSort extends Array {
    public InsertionSort(int[] array){
        super(array);
    }

    public void ordenar(){
        for(int i = 1; i < tam; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i] < array[j])
                    swap(i, j);
            }
            moves += stringArray(array, 0, i, false) +
                stringArray(array, i + 1, tam, true);
        }
    }
}
