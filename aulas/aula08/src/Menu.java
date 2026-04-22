import javax.swing.*;
import java.util.List;

public class Menu {
    public static int montaMenu() {
        String menu = """
                1. Cadastrar Pessoa em arquivo
                2. Listar todas as pessoas que estão no arquivo
                3. Pesquisar pessoa usando o cpf
                4. Sair
                """;

        String opcaoEscolhida = JOptionPane.showInputDialog(menu);

        if (opcaoEscolhida == null) {
            return 4;
        }

        try {
            return Integer.parseInt(opcaoEscolhida);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite um número.");
            return montaMenu();
        }
    }

    static void cadastraPessoaEmArquivo(String fileName) {
        try {
            String cpf = JOptionPane.showInputDialog("Insira o CPF da pessoa que quer cadastrar: ");
            String nome = JOptionPane.showInputDialog("Insira o nome da pessoa que quer cadastrar: ");
            String email = JOptionPane.showInputDialog("Insira o e-mail da pessoa que quer cadastrar: ");

            Pessoa novoCadastro = new Pessoa(cpf, nome, email);

            ArquivoObjeto.escreveObjeto(novoCadastro, fileName);
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
        } catch (IllegalStateException erro) {
            JOptionPane.showMessageDialog(null, String.format("""
                    Erro: %s""", erro.getMessage()));
        }
    }

    static void listaPessoasNoArquivo(String fileName) {
        List<Pessoa> listaDePessoas = validaLista(fileName);

        if (!listaDePessoas.isEmpty()) {
            for (Pessoa pessoa : listaDePessoas) {
                JOptionPane.showMessageDialog(null, pessoa);
            }
        }
    }

    static void buscaPessoaEmArquivoPorCpf(String fileName) {
        List<Pessoa> listaDePessoas = validaLista(fileName);

        if (!listaDePessoas.isEmpty()) {
            String cpfDeInteresse = JOptionPane.showInputDialog(null, "Insira o CPF que deseja buscar:");
            for (Pessoa pessoa : listaDePessoas) {
                if (pessoa.temOCpf(cpfDeInteresse)) {
                    JOptionPane.showMessageDialog(null, pessoa);
                }
            }
        }
    }

    static boolean encerraMenu() {
        JOptionPane.showMessageDialog(null, "Encerrando...");
        return false;
    }

    static List<Pessoa> validaLista(String fileName) {
        List<Pessoa> listaDePessoas = ArquivoObjeto.leObjetos(fileName);

        if (listaDePessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A lista está vazia ou não há arquivo");
        }

        return listaDePessoas;
    }
}
