// Crie a classe Palestra
// Palestra deve:
//   ser
//     subclasses de Atividade
//   ter
//     um Palestrante (composição) e
//     um atributo sala (int)

import java.time.LocalDateTime;

public class Palestra extends Atividade {
    private Palestrante palestrante;
    private int sala;

    public Palestra() {
    }

    public Palestra(String titulo, LocalDateTime horario, int duracaoEmMinutos, Palestrante palestrante, int sala) {
        super(titulo, horario, duracaoEmMinutos);
        this.palestrante = palestrante;
        this.sala = sala;
    }

    @Override
    public String toString() {
        return String.format("""
            %s
            Palestrante: %s
            Sala: %d
            """, super.toString(), palestrante, sala);
    }
}
