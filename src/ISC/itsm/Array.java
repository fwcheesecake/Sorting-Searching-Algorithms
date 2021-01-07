package ISC.itsm;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Array {
    int tam;
    int []array;

    public Array(){
        setTam(0);
        setArray(new int[10]);
    }

    public Array(int tam){
        setTam(tam);
        array = new int[tam];
    }

    public Array(int[] array){
        setTam(array.length);
        setArray(array);
    }

    public void setArray(int[] array){
        this.array = new int[tam];
        if (tam >= 0) System.arraycopy(array, 0, this.array, 0, tam);
    }

    public void setTam(int tam){
        this.tam = tam;
    }

    public int[] getArray(){
        return array;
    }

    public void write() throws IOException{
        String filename = this.getClass().getSimpleName();
        File output = new File("output\\" + filename + ".out");

        if(!output.exists())
            output.createNewFile();

        FileWriter wout = new FileWriter(output);

        System.out.println(filename + ": ");
        boolean sorted = true;
        wout.write("" + array[0] + "\n");
        for(int i = 1; i < tam; i++) {
            if(array[i - 1] > array[i]) {
                sorted = false;
                wout.write("This: " + array[i] + "\n");
            } else
                wout.write("" + array[i] + "\n");
        }

        wout.write((sorted) ? "ORDENADO" : "ALGO PASO");

        wout.close();
    }

    public void swap(int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
