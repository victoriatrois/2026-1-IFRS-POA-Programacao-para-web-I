package aula03;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Aula03Main {
    public static void main(String[] args) {
        executarExemploLista();
        executarExemploConjunto();
    }

    private static void executarExemploLista() {
        LinkedList<Number> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(7L);
        numeros.add(9.0f);
        numeros.add(2.3F);
        numeros.add(6.9);

        System.out.println("\n--- Aula 03 | Listas (LinkedList) ---");
        System.out.println("Lista inicial:");
        imprimeLista(numeros);

        System.out.println("\nPrimeiro numero da lista: " + numeros.getFirst());
        System.out.println("Ultimo numero da lista: " + numeros.getLast());
        System.out.println("Indice da primeira ocorrencia do long 7: " + numeros.indexOf(7L));
        System.out.println("Indice da ultima ocorrencia do float 9.0: " + numeros.lastIndexOf(9.0f));

        numeros.addLast(6);
        System.out.println("\nAdicionou um numero ao fim da lista:");
        imprimeLista(numeros);

        numeros.removeFirst();
        System.out.println("\nRemoveu o primeiro numero da lista:");
        imprimeLista(numeros);
    }

    private static void executarExemploConjunto() {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(7);
        numeros.add(9);
        numeros.add(2);
        numeros.add(6);

        System.out.println("\n--- Aula 03 | Conjuntos (TreeSet) ---");
        System.out.println("Conjunto ordenado inicial:");
        imprimeTreeSet(numeros);

        System.out.println("\nPrimeiro numero do conjunto: " + numeros.first());
        System.out.println("Ultimo numero do conjunto: " + numeros.last());

        numeros.removeFirst();
        System.out.println("\nRemoveu o primeiro numero do conjunto:");
        imprimeTreeSet(numeros);
    }

    private static void imprimeLista(List<Number> numeros) {
        for (Number numero : numeros) {
            if (numero != null) {
                System.out.println(numero);
            }
        }
    }

    private static void imprimeTreeSet(TreeSet<Integer> numerosOrdenados) {
        for (Integer numero : numerosOrdenados) {
            if (numero != null) {
                System.out.println(numero);
            }
        }
    }
}

