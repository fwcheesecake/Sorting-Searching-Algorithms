//COMPLETADO
package ISC.itsm;

public class CombSort extends Array {
    public CombSort(int[] array){
        super(array);
    }

    public int nextGap(int gap){
        int nGap = gap * 10 / 13;
        if(gap < 1)
            return 1;
        return nGap;
    }

    public void ordenar(){
        int gap = tam;
        boolean swapped = true;
        while(gap != 1 || swapped){
            swapped = false;
            gap = nextGap(gap);
            for(int i = 0; i < tam - gap; i++){
                if(array[i] > array[i + gap]){
                    swap(i, i + gap);
                    moves += "Gap: " + gap + "\t" + stringArray();
                    swapped = true;
                }
            }
        }
    }
}
