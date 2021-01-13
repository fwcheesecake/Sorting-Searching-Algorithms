//TERMINADO
package ISC.itsm;

public class ShellSort extends Array {
    public ShellSort(int[] array){
        super(array);
    }

    public void ordenar(){
        for(int gap = tam / 2; gap > 0; gap /= 2){
            for(int i = gap; i < tam; i++){
                int temp = array[i];
                int j;
                for(j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
                moves += stringArray();
            }
        }
    }
}
