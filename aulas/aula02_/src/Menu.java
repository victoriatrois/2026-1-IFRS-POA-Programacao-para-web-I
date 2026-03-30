import javax.swing.JOptionPane;

public class Menu {
    public static int montaMenu() {
        String menu = """
                1. Cadastrar funcionário
                2. Listar todos os funcionários
                3. Pesquisar funcionário por nome
                4. Pesquisar funcionário por salário maior que o informado
                5. Pesquisar funcionário por número de telefone
                6. Sair
                """;
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
