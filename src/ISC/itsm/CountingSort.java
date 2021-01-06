//TERMINADO
package ISC.itsm;

public class CountingSort extends Array {
    public CountingSort(){
        super();
    }
    public CountingSort(int[] array){
        super(array);
    }

    public void ordenar(){
        int min = array[0], max = array[0];
        for(int i = 1; i < tam; i++){
            if(array[i] < min)
                min = array[i];
            if(array[i] > max)
                max = array[i];
        }

        int n = max - min + 1;

        int[] counting = new int[n];
        int[] places = new int[tam];

        for(int i = 0; i < tam; i++)
            counting[array[i] - min]++;

        for(int i = 1; i < n; i++)
            counting[i] += counting[i - 1];

        for(int i = 0; i < tam; i++)
            places[--counting[array[i] - min]] = array[i];

        array = places;
    }
}
