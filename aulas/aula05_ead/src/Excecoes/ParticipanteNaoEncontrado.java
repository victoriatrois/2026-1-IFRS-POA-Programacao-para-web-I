package Excecoes;

public class ParticipanteNaoEncontrado extends RuntimeException {
    public ParticipanteNaoEncontrado(String message) {
        super(message);
    }
}
