package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformanceSet {

    public static void main(String[] args) {
        Collection<Integer> teste;

        System.out.println("Testando ArrayList");
        teste = new ArrayList<>();
        testar(teste);

        System.out.println("Testando HashSet");
        teste = new HashSet<>();
        testar(teste);
    }

    private static void testar(Collection<Integer> teste) {
        long inicio, fim;
        int total = 30000;
        
        System.out.println("Inserindo...");
        inicio =  System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto:  " + (fim - inicio));
        
        
        System.out.println("Buscando...");
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto:  " + (fim - inicio));
    }

}
