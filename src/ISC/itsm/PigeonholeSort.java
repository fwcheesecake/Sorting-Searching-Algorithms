//TERMINADO
package ISC.itsm;

public class PigeonholeSort extends Array{
    public PigeonholeSort(int[] array){
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
        int[] pigeonholes = new int[n];

        for(int i = 0; i < tam; i++)
            pigeonholes[array[i] - min]++;

        int k = 0;
        for(int i = 0; i < n; i++)
            while(pigeonholes[i] > 0)
                array[k++] = min + pigeonholes[i]--;
    }
}
