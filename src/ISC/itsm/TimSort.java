//TERMINADO
package ISC.itsm;

public class TimSort extends Array{
    public TimSort(int[] array){
        super(array);
    }
    
    public void ordenar(){
        timSort(tam);
    }
    
    int MIN_MERGE = 32;

    public int minRunLength(int n) {
        assert n >= 0;

        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }
    
    public void insertionSort(int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= left && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public void merge(int l, int m, int r) {
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int x = 0; x < len1; x++) {
            left[x] = array[l + x];
        }
        for (int x = 0; x < len2; x++) {
            right[x] = array[m + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < len1 && j < len2) {
            if (left[i] <= right[j])
            {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            array[k] = left[i];
            k++;
            i++;
        }

        while (j < len2) {
            array[k] = right[j];
            k++;
            j++;
        }
    }

    public void timSort(int n) {
        int minRun = minRunLength(MIN_MERGE);

        for (int i = 0; i < n; i += minRun)
            insertionSort(i, Math.min((i + 31), (n - 1)));

        for (int size = minRun; size < n; size = 2 * size) {

            for (int left = 0; left < n; left += 2 * size) {

                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));
                if(mid >= right) mid = (left + right) / 2;

                merge(left, mid, right);
            }
        }
    }
}
