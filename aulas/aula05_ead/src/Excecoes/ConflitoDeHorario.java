package Excecoes;

public class ConflitoDeHorario extends RuntimeException {
    public ConflitoDeHorario(String message) {
        super(message);
    }
}
