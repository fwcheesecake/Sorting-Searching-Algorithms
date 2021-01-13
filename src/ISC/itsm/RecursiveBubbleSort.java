package ISC.itsm;

public class RecursiveBubbleSort extends Array {
    RecursiveBubbleSort(int[] array){
        super(array);
    }

    public void ordenar(){
        recursion(tam);
    }

    public void recursion(int n){
        if(n == 1)
            return;
        moves += stringArray();
        for(int i = 1; i < n; i++)
            if(array[i] < array[i -1])
                swap(i, i - 1);
        recursion(n - 1);
    }
}
