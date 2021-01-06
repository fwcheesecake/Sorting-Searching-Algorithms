//COMPLETADO
package ISC.itsm;

public class BubbleSort extends Array {
    public BubbleSort(){
        super();
    }
    public BubbleSort(int[] array){
        super(array);
    }
    public void ordenar(){
        for(int i = 0; i < tam - 1; i++)
            for(int j = 0; j < tam - 1; j++)
                if(array[j] > array[j + 1])
                    swap(j, j + 1);
    }
}
