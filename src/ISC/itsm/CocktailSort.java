//TERMINADO:
package ISC.itsm;

public class CocktailSort extends Array {
    public CocktailSort(int[] array){
        super(array);
    }

    public void ordenar(){
        boolean swapped = true;
        int ini = 0;
        int fin = tam - 1;
        while(swapped){
            swapped = false;

            for(int i = ini; i < fin; i++){
                if(array[i] > array[i + 1]){
                    swapped = true;
                    swap(i, i + 1);
                }
            }
            if(!swapped)
                break;
            for(int i = fin; i > ini; i--){
                if(array[i] < array[i - 1]){
                    swapped = true;
                    swap(i, i - 1);
                }
            }
        }
    }
}
