package ISC.itsm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BinarySearch extends Array {
    public BinarySearch(int[] array){
        super(array);
        Arrays.sort(array);
    }

    public int buscar(int x){
        int ini = 0, fin = tam;
        while(ini < fin){
            int mid = (ini + fin) / 2;
            if(array[mid] == x){
                moves += "Encontrado en la posicion: " + mid;
                return mid;
            }
            else if(array[mid] < x)
                ini = mid + 1;
            else
                fin = mid;
        }
        moves += "No encontrado";
        return -1;
    }
    public void write() throws IOException {
        String filename = this.getClass().getSimpleName();
        File output = new File("output\\" + filename + ".out");

        if(!output.exists())
            output.createNewFile();

        FileWriter wout = new FileWriter(output);

        System.out.println(filename + ": ");
        wout.write(moves);
        wout.close();
    }
}
