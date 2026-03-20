import java.util.Comparator;

public class TelefoneComparator implements Comparator<Telefone> {

    @Override
    public int compare(Telefone telefone1, Telefone telefone2) {
        //  return Long.compare(numero, telefone.getNumero()); OU
        if (telefone1.getDdd() > telefone2.getDdd()) {
            return 1;
        }

        if (telefone1.getNumero() < telefone2.getNumero()) {
            return -1;
        }

        // if (numero == telefone.getNumero())
        return 0;
    }

}
