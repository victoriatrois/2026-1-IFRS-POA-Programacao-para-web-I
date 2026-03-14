package aula01;

// Toda classe herda da Object
public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;

    public Pessoa() {}

    // Ao declarar um construtor com passagem de parâmetros o construtor padrão deixa de ser criado automaticamente
    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // se não declararmos o toString, o da super Object é usado e ele determina que se imprima o <nome da cLasse>@<endereço do objeto na JVM>
    @Override
    public String toString() {
        return String.format("""
            Pessoa {
            \tnome: %s
            \ttelefone: %s
            \tendereço: %s
            }
            """, nome, telefone, endereco);
    }
}
