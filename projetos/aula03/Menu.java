package aula02;

import javax.swing.JOptionPane;

public class Menu {
    public static int montaMenu() {
        String menu =
                "1. Cadastrar funcionário\n" +
                "2. Listar todos os funcionários\n" +
                "3. Pesquisar funcionário por nome\n" +
                "4. Pesquisar funcionário por salário maior que o informado\n" +
                "5. Pesquisar funcionário por número de telefone\n" +
                "6. Sair\n"
                ;
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
