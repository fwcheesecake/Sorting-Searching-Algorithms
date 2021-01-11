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
            voltear(max + 1);
            voltear(i);
        }
    }

    public void voltear(int p){
        for(int i = 0; i < p / 2; i++)
            swap(i, p - i - 1);
    }
}
