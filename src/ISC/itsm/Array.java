package ISC.itsm;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    int tam;
    int []array;

    String moves = "";

    public int getTam() {
        return tam;
    }

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
        setMoves("Arreglo inicial: \n" + stringArray() + "-----------------------------------------------------------------------------\n");
    }

    public void setMoves(String moves){
        this.moves = moves;
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

    public String stringArray(){
        String out = "[" + array[0];
        for(int i = 1; i < tam; i++)
            out += "\t" + array[i];
        out += "]\n";
        return out;
    }

    public String stringArray(int[] array){
        String out = "[" + array[0];
        for(int i = 1; i < array.length; i++)
            out += "\t" + array[i];
        out += "]\n";
        return out;
    }

    public String stringArray(int[] array, int ini, int fin, boolean endl){
        if(ini >= fin)
            return ((endl) ? "\n" : "");
        String out = "[" + array[ini];
        for(int i = ini + 1; i < fin; i++)
            out += "\t" + array[i];
        out += "]";
        if(endl)
            out += "\n";
        return out;
    }

    public String stringArray(ArrayList<Integer> arraylist, boolean endl){
        if(arraylist.isEmpty())
            return "[]\n";
        String out = "[" + arraylist.get(0);
        for(int i = 1; i < arraylist.size(); i++){
            out += ",\t" + arraylist.get(i);
        }
        out += "]\n";
        return out;
    }

    public void write() throws IOException{
        String filename = this.getClass().getSimpleName();
        File output = new File("output\\" + filename + ".out");

        if(!output.exists())
            output.createNewFile();

        FileWriter wout = new FileWriter(output);

        System.out.println(filename + ": ");
        moves += "Arreglo ordenado: \n" + stringArray();
        wout.write(moves);
        wout.close();
    }

    public void swap(int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
