import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestesExcecoes {
    public static void main() {
//        try {
//            ArrayList<String> lista = new ArrayList<>();
//            lista.add("123");
//            lista.add("456");
//
//            String item = lista.get(2);
//
//            System.out.println(item);
//        } catch (IndexOutOfBoundsException exception) {
//            System.out.println("Ultrapassou o limite dos índices.");
//            System.out.println(exception.getMessage());
//        } catch (Exception exception) {
//            System.out.println("Exceção desconhecida.");
//            System.out.println(exception.getMessage());
//        }

//        try {
//            ArrayList<String> lista2 = null;
//            lista2.add("789");
//
//        } catch (NullPointerException exception) {
//            System.out.println("A lista está nula.");
//            System.out.println(exception.getMessage());
//
//        } catch (Exception exception) {
//            System.out.println("Exceção desconhecida.");
//            System.out.println(exception.getMessage());
//        }

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("chave 1", 1);
        mapa.put("chave 2", 2);

        try {
            int numero = mapa.get("chave3");
            System.out.println(numero);

        } catch (NullPointerException exception) {
            System.out.println("A lista está nula.");
            System.out.println(exception.getMessage());

        } catch (Exception exception) {
            System.out.println("Exceção desconhecida.");
            System.out.println(exception.getMessage());
        }
    }
}