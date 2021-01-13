package ISC.itsm;

public class PancakeSort extends Array{
    public PancakeSort(int[] array){
        super(array);
    }

    public void ordenar(){
        int max;
        for(int i = tam; i > 0; i--){
            max = 0;
            for(int j = 1; j < i; j++)
                if(array[max] < array[j])
                    max = j;
            moves += stringArray(array, 0, max + 1, false) + stringArray(array, max + 1, tam, true);
            voltear(max + 1);
            moves += stringArray(array, 0, max + 1, false) + stringArray(array, max + 1, tam, true);
            voltear(i);
            moves += stringArray();
            moves += "\n";
        }
    }

    public void voltear(int p){
        for(int i = 0; i < p / 2; i++)
            swap(i, p - i - 1);
    }
}
