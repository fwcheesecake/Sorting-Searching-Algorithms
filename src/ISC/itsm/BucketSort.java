package ISC.itsm;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort extends Array {
    public BucketSort(int[] array){
        super(array);
    }

    public void ordenar(){
        ArrayList<Integer>[] cubetas = new ArrayList[tam];

        for(int i = 0; i < tam; i++)
            cubetas[i] = new ArrayList<>();

        for(int i = 0; i < tam; i++)
            cubetas[array[i] / tam].add(array[i]);

        moves += "Cubetas: \n";
        for(int i = 0; i < tam; i++)
            moves += stringArray(cubetas[i], true);

        for(int i = 0; i < tam; i++)
            Collections.sort(cubetas[i]);

        moves += "Cubetas ordenadas: \n";
        for(int i = 0; i < tam; i++)
            moves += stringArray(cubetas[i], true);

        int k = 0;
        for(int i = 0; i < tam; i++)
            for(int j = 0; j < cubetas[i].size(); j++)
                array[k++] = cubetas[i].get(j);
    }
}
