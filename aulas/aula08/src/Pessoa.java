import java.io.Serializable;

public class Pessoa implements Serializable, Comparable<Pessoa> {
    private String cpf;
    private String nome;
    private String email;

    public Pessoa() {

    }

    public Pessoa(String cpf, String nome, String email) {
        validaAtributo(cpf, "CPF");
        validaAtributo(nome, "nome");
        validaAtributo(email, "e-mail");

        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                CPF: %s
                E-mail: %s""", nome, cpf, email);
    }

    @Override
    public int compareTo(Pessoa other) {
        //  return Integer.compare(this.nome.compareTo(other.nome), 0); OR
        if (this.nome.compareTo(other.nome) < 0) {
            return -1;
        } else if (this.nome.compareTo(other.nome) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    boolean temOCpf(String cpf) {
        return this.cpf.equals(cpf);
    }

    void validaAtributo(String valor, String atributo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(String.format("""
                    %s não pode ser vazio ou nullo.""", atributo));
        }
    }
}
