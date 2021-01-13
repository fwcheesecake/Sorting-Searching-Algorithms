//COMPLETADO
package ISC.itsm;

public class IntercalationSort extends Array {
    public IntercalationSort(int[] array){
        super(array);
    }

    public void ordenar() {
        int mid = tam / 2;
        int n2 = tam - mid;
        int[] a = new int[mid], b = new int[n2];
        if (mid >= 0) System.arraycopy(array, 0, a, 0, mid);
        if (n2 >= 0) System.arraycopy(array, mid, b, 0, n2);


        InsertionSort as = new InsertionSort(a);
        InsertionSort bs = new InsertionSort(b);

        as.ordenar();
        bs.ordenar();

        a = as.getArray();
        b = bs.getArray();

        moves += "A: " + stringArray(a);
        moves += "B: " + stringArray(b);

        int i = 0, j = 0;
        int k = 0;

        moves += "C: " + stringArray(array, 0, k, true);
        moves += "\n";

        while(i < mid && j < n2){
            moves += "A: " + stringArray(a, i, a.length, true);
            moves += "B: " + stringArray(b, j, b.length, true);
            moves += "C: " + stringArray(array, 0, k, true);
            moves += "\n";
            if(a[i] < b[j])
                array[k++] = a[i++];
            else
                array[k++] = b[j++];
        }

        moves += "A: " + stringArray(a, i, a.length, true);
        moves += "B: " + stringArray(b, j, b.length, true);
        moves += "C: " + stringArray(array, 0, k, true);
        moves += "\n";
        for(;i < mid; i++)
            array[k++] = a[i];
        for(;j < n2; j++)
            array[k++] = b[j];
        moves += "A: " + stringArray(a, i, a.length, true);
        moves += "B: " + stringArray(b, j, b.length, true);
        moves += "C: " + stringArray(array, 0, k, true);
        moves += "\n";
    }
}
