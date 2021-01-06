//TERMINADO
package ISC.itsm;

public class StoogeSort extends Array{
    public StoogeSort(int[] array){
        super(array);
    }

    public void ordenar(){
        stoogesort(0, tam - 1);
    }

    void stoogesort(int l, int h) {
        if (l >= h)
            return;

        if (array[l] > array[h])
            swap(l, h);

        if (h - l + 1> 2) {
            int t = (h - l + 1) / 3;

            stoogesort(l, h - t);
            stoogesort(l + t, h);
            stoogesort(l, h - t);
        }
    }
}
