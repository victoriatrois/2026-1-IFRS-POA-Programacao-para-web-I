package aula02;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Aula02Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            switch (Menu.montaMenu()) {
                case 1:
                    cadastrarFuncionario(funcionarios);
                    break;
                case 2:
                    listarFuncionarios(funcionarios);
                    break;
                case 3:
                    pesquisarPorNome(funcionarios);
                    break;
                case 4:
                    pesquisarPorSalario(funcionarios);
                    break;
                case 5:
                    pesquisarPorTelefone(funcionarios);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Encerrando a aula 02.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida.");
            }
        }
    }

    private static void cadastrarFuncionario(ArrayList<Funcionario> funcionarios) {
        String nome = JOptionPane.showInputDialog("Informe o nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario: "));
        String cargo = JOptionPane.showInputDialog("Informe o cargo: ");

        ArrayList<Telefone> telefones = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int ddd = Integer.parseInt(JOptionPane.showInputDialog(null, "DDD: "));
            long numero = Long.parseLong(JOptionPane.showInputDialog(null, "Numero: "));
            telefones.add(new Telefone(ddd, numero));
        }

        funcionarios.add(new Funcionario(nome, idade, salario, cargo, telefones));
        JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso.");
    }

    private static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nao ha funcionarios cadastrados.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                JOptionPane.showMessageDialog(null, funcionario.toString());
            }
        }
    }

    private static void pesquisarPorNome(ArrayList<Funcionario> funcionarios) {
        String nomePesquisado = JOptionPane.showInputDialog("Informe o nome a buscar: ");
        boolean funcionarioEncontrado = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null && funcionario.getNome().equalsIgnoreCase(nomePesquisado)) {
                JOptionPane.showMessageDialog(null, funcionario.toString());
                funcionarioEncontrado = true;
            }
        }

        if (!funcionarioEncontrado) {
            JOptionPane.showMessageDialog(null, "Nao ha funcionario com o nome informado.");
        }
    }

    private static void pesquisarPorSalario(ArrayList<Funcionario> funcionarios) {
        double salarioPesquisado = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o salario minimo para pesquisa: ")
        );

        boolean salarioEncontrado = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null && funcionario.getSalario() > salarioPesquisado) {
                JOptionPane.showMessageDialog(null, funcionario.toString());
                salarioEncontrado = true;
            }
        }

        if (!salarioEncontrado) {
            JOptionPane.showMessageDialog(null, "Nao ha funcionario com salario maior que o valor informado.");
        }
    }

    private static void pesquisarPorTelefone(ArrayList<Funcionario> funcionarios) {
        int dddPesquisado = Integer.parseInt(JOptionPane.showInputDialog(null, "DDD: "));
        long numeroPesquisado = Long.parseLong(JOptionPane.showInputDialog(null, "Numero: "));

        boolean telefoneEncontrado = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null && funcionario.getTelefones() != null) {
                for (Telefone telefone : funcionario.getTelefones()) {
                    if (telefone != null
                            && telefone.getDdd() == dddPesquisado
                            && telefone.getNumero() == numeroPesquisado) {
                        JOptionPane.showMessageDialog(null, funcionario.toString());
                        telefoneEncontrado = true;
                    }
                }
            }
        }

        if (!telefoneEncontrado) {
            JOptionPane.showMessageDialog(null, "Nao ha funcionario com o numero informado.");
        }
    }
}

