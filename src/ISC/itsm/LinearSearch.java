package ISC.itsm;

public class LinearSearch extends Array{
    public LinearSearch(int[] array){
        setArray(array);
    }

    public int buscar(int x){
        for(int i = 0; i < tam; i++)
            if(array[i] == x)
                return i;
        return -1;
    }
}
