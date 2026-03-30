// Crie a classe SessaoInterativa que deve
//   ser
//     subclasses de Atividade
//   ter
//     uma lista de Palestrantes (composição) e
//     um atributo limiteParticipantes

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SessaoInterativa extends Atividade {
    private ArrayList<Palestrante> palestrantes;
    private int limiteDePalestrantes;

    public SessaoInterativa() {
    }

    public SessaoInterativa(String titulo, LocalDateTime horario, int duracaoEmMinutos, ArrayList<Palestrante> palestrantes, int limiteDePalestrantes) {
        super(titulo, horario, duracaoEmMinutos);
        this.palestrantes = palestrantes;
        this.limiteDePalestrantes = limiteDePalestrantes;
    }

    @Override
    public String toString() {
        StringBuilder listaDePalestrantes = new StringBuilder();

        if (palestrantes != null) {
            for (int i = 0; i < palestrantes.size(); i++) {
                Palestrante palestrante = palestrantes.get(i);
                if (palestrante != null) {
                    listaDePalestrantes.append(palestrante.toString());

                    if (i < palestrantes.size() - 1) {
                        listaDePalestrantes.append(", ");
                    }
                }
            }
        }
        return String.format("""
                %s
                Palestrante: %s
                Limite de participantes: %d
                """, super.toString(), listaDePalestrantes, limiteDePalestrantes);
    }
}
