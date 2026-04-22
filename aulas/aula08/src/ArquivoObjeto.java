import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArquivoObjeto {
    static void escreveObjeto(Pessoa pessoa, String fileName) {
        List<Pessoa> pessoasExistentes;
        pessoasExistentes = leObjetos(fileName);

        pessoasExistentes.add(pessoa);
        Collections.sort(pessoasExistentes);

        try (
                ObjectOutputStream out = new ObjectOutputStream(
                        new FileOutputStream(fileName))
        ) {
            out.writeObject(pessoasExistentes);

        } catch (SecurityException error) {
            System.out.println("Faltam permissões para executar essa ação.");

        } catch (FileNotFoundException error) {
            System.out.println("Arquivo não encontrado");

        } catch (NullPointerException error) {
            System.out.println("O nome do arquivo está nulo.");

        } catch (StreamCorruptedException error) {
            System.out.println("O arquivo foi corrompido.");

        } catch (InvalidClassException error) {
            System.out.println("Classe inválida.");

        } catch (OptionalDataException error) {
            System.out.println("Tipos primitivos não podem ser salvos.");

        } catch (IllegalStateException error) {
            System.out.println("Estado inválido do fluxo de dados.");

        } catch (IOException error) {
            System.out.println("Erro ao ler no arquivo.");

        } catch (Exception error) {
            System.out.println("Exceção desconhecida");
        }
    }

    static List<Pessoa> leObjetos(String fileName) {
        List<Pessoa> pessoas = new ArrayList<>();

        try (
                ObjectInputStream in = new ObjectInputStream(
                        new FileInputStream(fileName))
        ) {
            pessoas = (List<Pessoa>) in.readObject();
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }

        } catch (SecurityException error) {
            System.out.println("Faltam permissões para executar essa ação.");

        } catch (FileNotFoundException error) {
            System.out.println("Arquivo não encontrado");

        } catch (NullPointerException error) {
            System.out.println("O nome do arquivo está nulo.");

        } catch (StreamCorruptedException error) {
            System.out.println("O arquivo foi corrompido.");

        } catch (ClassNotFoundException error) {
            System.out.println("Classe não encontrada.");

        } catch (ClassCastException error) {
            System.out.println("Cast não permitido.");

        } catch (InvalidClassException error) {
            System.out.println("Classe inválida. A classe deve ter sido atualizada em relação a quando o arquivo atual foi gerado.");

        } catch (OptionalDataException error) {
            System.out.println("Tipos primitivos não podem ser salvos.");

        } catch (IllegalStateException error) {
            System.out.println("Estado inválido do fluxo de dados.");

        } catch (IOException error) {
            System.out.println("Erro ao ler no arquivo.");

        } catch (Exception error) {
            System.out.println("Exceção desconhecida");
        }
        return pessoas;
    }
}
