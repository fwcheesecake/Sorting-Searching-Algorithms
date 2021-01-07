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
        
        int i = 0, j = 0;
        int k = 0;
        while(i < mid && j < n2){
            if(a[i] < b[j])
                array[k++] = a[i++];
            else
                array[k++] = b[j++];
        }

        for(;i < mid; i++)
            array[k++] = a[i];
        for(;j < n2; j++)
            array[k++] = b[j];
    }
}
