public class Palestrante extends Pessoa {
    private String especialidade;

    public Palestrante() {
    }

    public Palestrante(String cpf, String nome, String email, String especialidade) {
        super(cpf, nome, email);
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return String.format("""
                Palestrante:
                %s
                Especialidade: %s
                """, super.toString(), especialidade);
    }
}
