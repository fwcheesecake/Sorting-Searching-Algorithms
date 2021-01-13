package ISC.itsm;

public class HeapSort extends Array{
    public HeapSort(int[] array){
        super(array);
    }

    public void ordenar(){
        moves += "Construyendo el heap:\n";
        buildHeap();
        moves += "Heap construido:\n";
        moves += stringArray();
        moves += "-------------------------------------------------------------\n";
        for(int i = tam - 1; i > 0; i--){
            swap(i, 0);
            heapify(0, i);
        }
    }

    public void heapify(int root, int n) {
        int left = root * 2 + 1;
        int right = root * 2 + 2;
        int max = root;

        if (left < n && array[max] < array[left])
            max = left;
        if (right < n && array[max] < array[right])
            max = right;

        if (root != max) {
            moves += root + "\t<->\t" + max + "\t" + stringArray();
            swap(root, max);
            heapify(max, n);
        }
    }

    public void buildHeap(){
        for(int i = tam / 2 - 1; i >= 0; i--)
            heapify(i, tam);
    }
}
