package Excecoes;

public class ParticipanteJaInscrito extends RuntimeException {
    public ParticipanteJaInscrito(String message) {
        super(message);
    }
}
