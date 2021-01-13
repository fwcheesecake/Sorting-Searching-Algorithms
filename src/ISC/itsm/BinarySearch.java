package ISC.itsm;

public class BinarySearch extends Array {
    public BinarySearch(int[] array){
        super(array);
    }

    public int buscar(int x){
        int ini = 0, fin = tam;
        while(ini < tam){
            int mid = (ini + fin) / 2;
            if(array[mid] == x)
                return mid;
            else if(array[mid] < x)
                ini = mid + 1;
            else
                fin = mid;
        }
        return -1;
    }
}
