package pacoteEstatico;

public class TesteEstatico {
    static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        System.out.println(p1.toString());

        Pessoa p2 = new Pessoa("Eu");
        System.out.println(p2.toString());

        Pessoa p3 = new Pessoa("Tu");
        System.out.println(p3.toString());

        System.out.println(Pessoa.getContador());
    }
}
