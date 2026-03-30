// Crie uma classe Atividade com os atributos
//   titulo,
//   horário (use a classe LocalDateTime) e
//   duracaoMinutos.
// Inclua o método toString()

import java.time.LocalDateTime;

public class Atividade {
    private String titulo;
    private LocalDateTime horario;
    private int duracaoEmMinutos;

    public Atividade() {
    }

    public Atividade(String titulo, LocalDateTime horario, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.horario = horario;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    @Override
    public String toString() {
        String horarioPorExtenso = (horario != null) ? horario.toString() : "Horário não cadastrado";
        return String.format("""
               Título: %s
               Horário: %s,
               Duração em minutos: %d
               """, titulo, horarioPorExtenso, duracaoEmMinutos);
    }
}
