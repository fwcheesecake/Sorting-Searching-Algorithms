//COMPLETADO
package ISC.itsm;

public class IntercalationSort extends Array {
    public IntercalationSort(int[] array){
        super(array);
    }

    public void ordenar(){
        int mid = tam / 2;
        int n1 = mid;
        int n2 = tam - mid;
        int[] a = new int[n1], b = new int[n2];
        for(int i = 0; i < n1; i++)
            a[i] = array[i];
        for(int j = 0; j < n2; j++)
            b[j] = array[mid + j];

        InsertionSort as = new InsertionSort(a);
        InsertionSort bs = new InsertionSort(b);

        as.ordenar();
        bs.ordenar();

        a = as.getArray();
        b = bs.getArray();
        
        int i = 0, j = 0;
        int k = 0;
        while(i < n1 && j < n2){
            if(a[i] < b[j])
                array[k++] = a[i++];
            else
                array[k++] = b[j++];
        }

        while(i < n1)
            array[k++] = a[i++];
        while(j < n2)
            array[k++] = b[j++];
    }
}
