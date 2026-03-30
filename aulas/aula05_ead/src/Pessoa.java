//  Crie uma classe Pessoa com atributos cpf, nome e email

public class Pessoa {
    private String nome;
    private String email;
    private Cpf cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, Cpf cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        String numeroDoCpf = (cpf != null) ? cpf.toString() : "CPF não cadastrado";

        return String.format("""
            Nome: %s
            E-mail: %s
            CPF: %s
            """, nome, email, numeroDoCpf);
    }
}
