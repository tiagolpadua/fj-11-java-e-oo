package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaCollections {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Conta c1 = new ContaCorrente();
        c1.setTitular("Maria");
        contas.add(c1);
        
        Conta c2 = new ContaCorrente();
        c2.setTitular("João");
        contas.add(c2);
        
        Conta c3 = new ContaCorrente();
        c3.setTitular("Paulo");
        contas.add(c3);
        
        System.out.println("Lista original:");
        imprime(contas);
        
        System.out.println("\nreverseOrder:");
        Collections.sort(contas, Collections.reverseOrder());
        imprime(contas);
        
        System.out.println("\nshuffle:");
        Collections.shuffle(contas);
        imprime(contas);
        
        System.out.println("\nrotate:");
        Collections.rotate(contas, 1);
        imprime(contas);
    }

    private static void imprime(List<Conta> contas) {
        for(Conta c: contas) {
            System.out.println(c);
        }
    }

}
