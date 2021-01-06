//TERMINADO
package ISC.itsm;

public class GnomeSort extends Array {
    public GnomeSort(int[] array){
        super(array);
    }

    public void ordenar(){
        int index = 0;

        while (index < tam) {
            if (index == 0)
                index++;
            if (array[index] >= array[index - 1])
                index++;
            else {
                int temp = 0;
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }

}
