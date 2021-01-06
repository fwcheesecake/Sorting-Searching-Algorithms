//COMPLETADO
package ISC.itsm;

import java.util.Arrays;

public class RadixSort extends Array{
    public RadixSort(int[] arrayay){
        super(arrayay);
    }
    
     int getMax(int n) {
        int mx = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > mx)
                mx = array[i];
        return mx;
    }

     void countSort(int n, int exp) {
        int[] output= new int[n];
        int i;
        int[] count= new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(array[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            array[i] = output[i];
    }

     public void ordenar() {
        int m = getMax(tam);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(tam, exp);
    }
}
