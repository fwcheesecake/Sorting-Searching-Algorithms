package ISC.itsm;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.File;

public class Main {
    private static Scanner sc;
    private static Scanner scFile;
    private static int[] array;

    public static int selectOption(String input, String message){
        System.out.println(message);
        int i = 1;
        for(String s : input.split(", "))
            System.out.println((i++) + ". " + s);
        return readInt("Seleccione una opcion");
    }

    public static int readInt(String message){
        System.out.print(message + "\n> ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        init();
        int op = 0;
        do{
            try {
                op = selectOption("Ordenar, Buscar, Salir", "Que desea hacer");
                switch (op) {
                    case 1 -> ordenar();
                    case 2 -> buscar();
                    case 3 -> System.out.println("Hasta luego");
                }
            } catch (IOException e){
                System.out.println("Something went wrong");
            }
        } while(op != 3);
        sc.close();
    }
    
    public static void ordenar() throws IOException{
        String opciones = "Bubble Sort, Cocktail Sort, Comb Sort, Counting Sort, " +
                "Cycle Sort, Gnome Sort (Stupid Sort), Heap Sort, Insertion Sort, " +
                "Intercalation Sort, Merge Sort, Natural Merge Sort, Pancake Sort, " +
                "Pigeonhole Sort, Quick Sort, Radix Sort, Selection Sort, Shell Sort, " +
                "Stooge Sort, Strand Sort, Tim Sort, Regresar";
        int op;
        do{
            op = selectOption(opciones, "Que algoritmo desea usar");
            switch (op){
                case 1 -> bubbleSort();
                case 2 -> cocktailSort();
                case 3 -> combSort();
                case 4 -> countinggSort();
                case 5 -> cycleSort();
                case 6 -> gnomeSort();
                case 7 -> heapSort();
                case 8 -> insertionSort();
                case 9 -> intercalationSort();
                case 10 -> mergeSort();
                case 11 -> naturalMergeSort();
                case 12 -> pancakeSort();
                case 13 -> pigeonholeSort();
                case 14 -> quickSort();
                case 15 -> radixSort();
                case 16 -> selectionSort();
                case 17 -> shellSort();
                case 18 -> stoogeSort();
                case 19 -> strandSort();
                case 20 -> timSort();
                case 21 -> rBubbleSort();
                case 22 -> bucketSort();
            }
        } while(op != 22);
    }
    
    public static void buscar(){

    }

    public static void bucketSort() throws IOException {
        BucketSort sort = new BucketSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void mergeSort() throws IOException {
        MergeSort sort = new MergeSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void bubbleSort() throws IOException {
        BubbleSort sort = new BubbleSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void cocktailSort() throws IOException {
        CocktailSort sort = new CocktailSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void combSort() throws IOException {
        CombSort sort = new CombSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void countinggSort() throws IOException {
        CountingSort sort = new CountingSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void cycleSort() throws IOException {
        CycleSort sort = new CycleSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void gnomeSort() throws IOException {
        GnomeSort sort = new GnomeSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void heapSort() throws IOException {
        HeapSort sort = new HeapSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void insertionSort() throws IOException {
        InsertionSort sort = new InsertionSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void intercalationSort() throws IOException {
        IntercalationSort sort = new IntercalationSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void naturalMergeSort () throws IOException {
        NaturalMergeSort sort = new NaturalMergeSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void pancakeSort() throws IOException {
        PancakeSort sort = new PancakeSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void pigeonholeSort() throws IOException {
        PigeonholeSort sort = new PigeonholeSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void quickSort() throws IOException {
        QuickSort sort = new QuickSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void radixSort() throws IOException {
        RadixSort sort = new RadixSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void selectionSort() throws IOException {
        SelectionSort sort = new SelectionSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void shellSort() throws IOException {
        ShellSort sort = new ShellSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void stoogeSort() throws IOException {
        StoogeSort sort = new StoogeSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void strandSort() throws IOException {
        StrandSort sort = new StrandSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void timSort() throws IOException {
        TimSort sort = new TimSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void rBubbleSort() throws IOException {
        RecursiveBubbleSort sort = new RecursiveBubbleSort(array);
        sort.ordenar();
        sort.write();
    }
    public static void init(){
        try {
            File testcase = new File("input\\testcase.in");
            if(!testcase.exists())
                testcase.createNewFile();
            File input = new File("input\\input.in");
            if(!input.exists())
                input.createNewFile();
            sc = new Scanner(new FileInputStream(testcase));
            scFile = new Scanner(new FileInputStream(input));
        } catch(Exception e){
            System.out.println("ALGO PASO");
        }
        int tam = scFile.nextInt();
        scFile.nextLine();
        array = new int[tam];
        String linea = scFile.nextLine();
        linea = linea.substring(1, linea.length() - 1);
        scFile = new Scanner(linea).useDelimiter(",\\s");
        for(int i = 0; i < tam; i++)
            array[i] = scFile.nextInt();
        scFile.close();
    }
}
