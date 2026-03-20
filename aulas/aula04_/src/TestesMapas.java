import java.util.LinkedHashMap;
import java.util.Set;

public class TestesMapas {
    public static void main() {
        LinkedHashMap<String, Integer> meuMapa = new LinkedHashMap<>();
        meuMapa.put("um", 1);
        meuMapa.put("três", 3);
        meuMapa.put("cinco", 5);
        meuMapa.put("sete", 7);

        Set<String> chaves = meuMapa.keySet();

        for (String chave : chaves) {
            if (meuMapa.containsKey(chave)) {
                int valor = meuMapa.get(chave);

                System.out.printf("""
                        O valor da chave %s é %d
                        %n""", chave, valor);
            }
        }

        // ordenando listas com collections
        // Collections é uma classe com vários métodos


    }
}