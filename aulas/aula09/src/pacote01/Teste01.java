package pacote01;

public class Teste01 {
    public static void main (String[] args) {
        A objeto = new A();
        // Por que conseguimos acessar b, c e d sem getters/setters?
          // Porque protected e default dão acesso a nível de pacote e
        // Isso está correto?
          // Incorreto porque conceitualmente devemos usar OO.
        // private, protected e public têm relação com...
          // Acesso / encapsulamento

//        System.out.println(objeto.a); // está fora da classe
        System.out.println(objeto.b);
        System.out.println(objeto.c);
        System.out.println(objeto.d);
    }
}
