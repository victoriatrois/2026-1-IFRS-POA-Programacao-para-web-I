// Crie a classe Palestrante que
//   é subclasses de Pessoa e
//   tem o atributo especialidade

 public class Palestrante extends Pessoa {
    private String especialidade;

    public Palestrante() {
    }

    public Palestrante(String nome, String email, Cpf cpf, String especialidade) {
        super(nome, email, cpf);
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return String.format("""
            %s
            Especialidade: %s
            """, super.toString(), especialidade);
    }
}
