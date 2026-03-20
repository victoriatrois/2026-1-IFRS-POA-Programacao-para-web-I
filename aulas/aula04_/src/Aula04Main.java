import java.util.HashSet;

public class Aula04Main {
    public static void main(String[] args) {

        var anotacoes = """
        Maps: interface
            HashMap
        """;

        HashSet<Number> conjuntoA = new HashSet<>();
        HashSet<Number> conjuntoB = new HashSet<>();

        conjuntoA.add(1);
        conjuntoA.add(5);
        conjuntoA.add(7);
        conjuntoA.add(10);

        conjuntoB.add(2);
        conjuntoB.add(4);
        conjuntoB.add(6);
        conjuntoB.add(10);

        // adiciona no conjunto que chama o método os elementos do conjunto informado
        conjuntoA.addAll(conjuntoB); // = A U B

        for (Number elemento : conjuntoB) {
            System.out.println(elemento);
        }

        conjuntoA = inicializaConjuntoA();

        // A - B
        conjuntoB.removeAll(conjuntoA);
        imprimeConjunto(conjuntoB);
        conjuntoB = inicializaConjuntoB();

        // B - A
        conjuntoA.removeAll(conjuntoB);
        imprimeConjunto(conjuntoA);
        conjuntoA = inicializaConjuntoA();

        // intersecção
        conjuntoB.retainAll(conjuntoA);
        imprimeConjunto(conjuntoB);



    }

    private static void imprimeConjunto(HashSet<Number> conjunto) {
        for (Number elemento : conjunto) {
            System.out.println(elemento);
        }
    }

    private static HashSet<Number> inicializaConjuntoA() {
        HashSet<Number> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(7);
        conjunto.add(10);

        return conjunto;
    }
    private static HashSet<Number> inicializaConjuntoB() {
        HashSet<Number> conjunto = new HashSet<>();

        conjunto.add(2);
        conjunto.add(4);
        conjunto.add(6);
        conjunto.add(10);

        return conjunto;
    }
}

