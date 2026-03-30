// Crie a classe Participante que é subclasses de Pessoa.

public class Participante extends Pessoa implements Comparable<Participante> {
    public Participante() {
    }

    public Participante(String nome, String email, Cpf cpf) {
        super(nome, email, cpf);
    }

//    @Override
//    public Cpf getCpf() {
//        return super.getCpf();
//    }

    @Override
    public String toString() {
        return String.format("""
            %s
            """, super.toString());
    }

    @Override
    public int compareTo(Participante novoParticipante) {
        return this.getNome().compareTo(novoParticipante.getNome());
    }
}
