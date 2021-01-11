package ISC.itsm;

public class NaturalMergeSort extends Array {
    NaturalMergeSort(int[] array){
        super(array);
    }

    public void ordenar(){
        split();
    }

    public void split(){
        int i, I;
        int d, D = tam - 1;

        boolean ordenado;
        do {
            ordenado = true;
            I = 0;
            while(I < D){
                i = I;
                while(i < D && array[i] <= array[i + 1]){
                    i++;
                }
                d = i + 1;
                while(d == D - 1 || d < D && array[d] <= array[d + 1]){
                    d++;
                }
                if(d <= D){
                    merge(I, i + 1, d + 1);
                    ordenado = false;
                }
                I = i + 1;
            }
        } while(!ordenado);
    }

    public void merge(int l, int m, int r){
        System.out.println("L: " + l + ", M: " + m + ", R: " + r);
        int n1 = m - l;
        int n2 = r - n1;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        int i = 0, j = 0, k = 0;
        for(; i < n1; i++)
            arr1[i] = array[k++];
        //System.out.println("Valor de K: " + k);
        //System.out.println("N1: " + n1);
        //System.out.println("N2: " + n2);
        for(; j < n2; j++)
            arr2[j] = array[k++];

        i = 0; j = 0; k = 0;

        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j])
                array[k++] = arr1[i++];
            else
                array[k++] = arr2[j++];
        }

        while(i < n1 && k < r)
            array[k++] = arr1[i++];
        while(i < n2 && k < r)
            array[k++] = arr2[j++];
    }
}
