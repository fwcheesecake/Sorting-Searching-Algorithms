package ISC.itsm;

import java.util.LinkedList;

public class StrandSort extends Array {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    LinkedList<Integer> op = new LinkedList<>();

    public StrandSort(int[] array){
        super(array.length);
        setMoves("Arreglo inicial: \n" + stringArray(array) + "-----------------------------------------------------------------------------\n");
        setLinkedList(array);
        setTam(array.length);
    }

    public void setLinkedList(int[] array){
        for(int x : array)
            linkedList.add(x);
    }

    public void setArray(LinkedList<Integer> list){
        int i = 0;
        while(i < tam && !list.isEmpty()){
            array[i++] = list.getFirst();
            list.removeFirst();
        }
    }

    public void ordenar(){
        strandSort();
        setArray(op);
    }

    public LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b){
        moves += stringArray(a, false) + stringArray(b, true);
        LinkedList<Integer> aux = new LinkedList<>();
        while(!a.isEmpty() && !b.isEmpty()){
            if(a.getFirst() < b.getFirst()){
                aux.add(a.getFirst());
                a.removeFirst();
            } else{
                aux.add(b.getFirst());
                b.removeFirst();
            }
        }
        for(; !a.isEmpty(); a.removeFirst())
            aux.add(a.getFirst());
       for(; !b.isEmpty(); b.removeFirst())
           aux.add(b.getFirst());
        moves += stringArray(aux, true);
        return aux;
    }

    public void strandSort(){
        LinkedList<Integer> sublist = new LinkedList<>();

        if(linkedList.isEmpty())
            return;

        sublist.add(linkedList.getFirst());
        linkedList.removeFirst();

        for(int i = 0; i < linkedList.size();){
            if(linkedList.get(i) > sublist.getLast()){
                sublist.addLast(linkedList.get(i));
                linkedList.remove(i);
            } else i++;
        }

        op = merge(sublist, op);

        strandSort();
    }

    public String stringArray(LinkedList<Integer> ll, boolean endl){
        if(ll.isEmpty())
            return (endl ? "\n" : "");
        String out = "[" + ll.get(0);
        for(int i = 1; i < ll.size(); i++)
            out += "\t" + ll.get(i);
        out += "]" + (endl ? "\n" : "");
        return out;
    }
}
