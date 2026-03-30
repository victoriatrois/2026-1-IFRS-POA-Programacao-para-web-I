// Toda classe herda da Object
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {}

    // Ao declarar um construtor com passagem de parâmetros o construtor padrão deixa de ser criado automaticamente
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // se não declararmos o toString, o da super Object é usado e ele determina que se imprima o <nome da cLasse>@<endereço do objeto na JVM>
    @Override
    public String toString() {

        return String.format("""
            Pessoa {
            \tnome: %s
            \tidade: %d
            }
            """, nome, idade);
    }
}
