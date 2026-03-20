import java.util.HashSet;
import java.util.TreeSet;

public class Ordenacao {
    public static void main() {
        HashSet<Cpf> cpfs1 = new HashSet<>();
        cpfs1.add(new Cpf(1, 1));
        cpfs1.add(new Cpf(2, 2));
        cpfs1.add(new Cpf(3, 3));

        HashSet<Cpf> cpfs2 = new HashSet<>();
        cpfs2.add(new Cpf(2, 2));
        cpfs2.add(new Cpf(3, 3));
        cpfs2.add(new Cpf(1, 1));

        // Comparable (Interface) vs. Comparator ()

        TelefoneComparator comparator = new TelefoneComparator();
        TreeSet<Telefone> conjuntoDeTelefones = new TreeSet<>(comparator);
        conjuntoDeTelefones.add(new Telefone(51, 987654321));
        conjuntoDeTelefones.add(new Telefone(52, 998765432));
        conjuntoDeTelefones.add(new Telefone(53, 999876543));
        conjuntoDeTelefones.add(new Telefone(54, 999887654));
        conjuntoDeTelefones.add(new Telefone(55, 999888765));

        System.out.println(conjuntoDeTelefones);
        

    }
}