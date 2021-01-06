package ISC.itsm;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Array {
    int tam;
    int array[];

    public Array(){
        setTam(0);
        setArray(new int[10]);
    }

    public Array(int tam){
        setTam(tam);
        array = new int[tam];
    }

    public Array(int[] array){
        setArray(array);
        setTam(array.length);
    }

    public void setArray(int[] array){
        this.array = array;
    }

    public void setTam(int tam){
        this.tam = tam;
    }

    public int[] getArray(){
        return array;
    }

    public void mostrar(){
        System.out.println("Arreglo: ");
        for(int x : array)
            System.out.println(x);
    }

    public void write() throws IOException{
        String filename = this.getClass().getSimpleName();
        File output = new File("output\\" + filename + ".out");

        if(!output.exists())
            output.createNewFile();

        FileWriter wout = new FileWriter(output);

        System.out.println(filename + ": ");
        for(int i = 0; i < tam; i++)
            wout.write("" + array[i] + "\n");
        wout.close();
    }

    public void swap(int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
