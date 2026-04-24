package pacoteEstatico;

public class Pessoa {
    private static int contador;

    private String nome;

    public Pessoa() {
        this(null); // chama o contrutor com parâmetros passando nulo
    }

    public Pessoa(String nome) {
        this.nome = nome;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return String.format("""
                Total de pessoas criadas: %d
                """, contador);
    }

}
