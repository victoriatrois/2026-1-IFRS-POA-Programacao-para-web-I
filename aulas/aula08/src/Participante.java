public class Participante extends Pessoa {

    public Participante() {
    }

    public Participante(String cpf, String nome, String email) {
        super(cpf, nome, email);
    }

    @Override
    public String toString() {
        return String.format("""
                Participante:
                %s
                """, super.toString());
    }
}
