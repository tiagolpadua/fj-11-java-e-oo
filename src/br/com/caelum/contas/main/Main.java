package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        long qtd = 100000;
        List<String> lista;
        
        System.out.println("Testes ArrayList");
        lista = new ArrayList<>();
        testar(qtd, lista);
        
        System.out.println("Testes LinkedList");
        lista = new LinkedList<>();
        testar(qtd, lista);
    }

    private static void testar(long qtd, List<String> lista) {
        long t;
        t = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < qtd; i++) {
            lista.add("foo");
        }
        System.out.println("Tempo inclusão: " + (Calendar.getInstance().getTimeInMillis() - t));
        
        for (int i = 0; i < qtd; i++) {
            lista.get(i);
        }
        System.out.println("Tempo busca: " + (Calendar.getInstance().getTimeInMillis() - t));
    }
}
