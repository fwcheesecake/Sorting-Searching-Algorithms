//TERMINADO
package ISC.itsm;

public class CycleSort extends Array {
    public CycleSort(int[] array){
        super(array);
    }

    public void ordenar(){

        for (int cycle_start = 0; cycle_start <= tam - 2; cycle_start++) {
            int item = array[cycle_start];

            int pos = cycle_start;
            for (int i = cycle_start + 1; i < tam; i++)
                if (array[i] < item)
                    pos++;

            if (pos == cycle_start)
                continue;

            while (item == array[pos])
                pos += 1;

            if (pos != cycle_start) {
                int temp = item;
                item = array[pos];
                array[pos] = temp;
            }

            moves += item + "\t";
            moves += stringArray();

            while (pos != cycle_start) {
                pos = cycle_start;

                for (int i = cycle_start + 1; i < tam; i++)
                    if (array[i] < item)
                        pos += 1;

                while (item == array[pos])
                    pos += 1;

                moves += item + "\t";
                moves += stringArray();
                if (item != array[pos]) {
                    int temp = item;
                    item = array[pos];
                    array[pos] = temp;
                }
            }
        }
    }
}
