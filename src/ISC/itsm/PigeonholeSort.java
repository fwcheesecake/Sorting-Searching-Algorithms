//TERMINADO
package ISC.itsm;

import java.util.Arrays;

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

        Arrays.fill(pigeonholes, 0);

        moves += "Nidos de paloma:\n";
        moves += stringArray(pigeonholes);

        for(int i = 0; i < tam; i++)
            pigeonholes[array[i] - min]++;

        moves += "Nidos de paloma\n";
        moves += stringArray(pigeonholes);

        moves += "Sacando los elementos de los nidos\n";
        int k = 0;
        for(int i = 0; i < n; i++)
            while(pigeonholes[i] > 0) {
                array[k++] = i + min;
                moves += stringArray(array, 0, k, true);
                pigeonholes[i]--;
            }
    }
}
