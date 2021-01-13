//TERMINADO
package ISC.itsm;

public class GnomeSort extends Array {
    public GnomeSort(int[] array){
        super(array);
    }

    public void ordenar(){
        int index = 0;

        while (index < tam) {
            moves += "Pos: " + index + "\t" + stringArray();
            if (index == 0)
                index++;
            if (array[index] >= array[index - 1])
                index++;
            else {
                int temp;
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }

}
