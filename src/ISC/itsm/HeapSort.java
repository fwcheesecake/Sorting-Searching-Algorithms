package ISC.itsm;

public class HeapSort extends Array{
    public HeapSort(){
        super();
    }
    public HeapSort(int[] array){
        super(array);
    }

    public void ordenar(){
        buildHeap();
        for(int i = tam - 1; i > 0; i--){
            swap(i, 0);
            heapify(0);
        }
    }

    public void heapify(int root) {
        int left = root * 2 + 1;
        int right = root * 2 + 2;
        int max = root;

        if(left >= tam)
            return;
        if (array[max] < array[left])
            max = left;
        if(right >= tam)
            return;
        if (array[max] < array[right])
            max = right;

        if (root != max) {
            swap(root, max);
            heapify(max);
        }
    }

    public void buildHeap(){
        for(int i = 0; i < tam / 2 + 1; i++)
            heapify(i);
    }
}
