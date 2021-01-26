package ISC.itsm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LinearSearch extends Array{
    public LinearSearch(int[] array){
        super(array);
    }

    public int buscar(int x){
        for(int i = 0; i < tam; i++)
            if(array[i] == x){
                moves += "Encontrado en la posicion: " + i;
                return i;
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
