package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 10);
        System.out.println("List: " + list);
        
        Collection<Integer> collection = new ArrayList<>();
        // collection.add(1, 10); // The method add(Integer) in the type Collection<Integer> is not applicable for the arguments (int, int)
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(10);
        System.out.println("Collection: " + collection);
    }

}
