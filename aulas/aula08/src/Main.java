import javax.swing.*;

void main() {
    Pessoa pessoa = new Pessoa("cpf1", "nome1", "email1");
//    System.out.println((pessoa + "\n"));

    Participante participante = new Participante("cpf2", "nome2", "email2");
//    System.out.println((participante));

    Palestrante palestrante = new Palestrante("cpf3", "nome3", "email3", "especialidade1");
//    System.out.println((palestrante));

    final String ARQUIVO = "Pessoas.bin";

//    System.out.println(ARQUIVO);

//    ArquivoObjeto.escreveObjeto(pessoa, ARQUIVO);
//    ArquivoObjeto.escreveObjeto(participante, ARQUIVO);
//    ArquivoObjeto.escreveObjeto(palestrante, ARQUIVO);
//
//    ArquivoObjeto.leObjetos(ARQUIVO);

    boolean continua = true;

    while (continua) {
        int opcao = Menu.montaMenu();
        continua = executaOpcao(opcao, ARQUIVO);
    }
}

private static boolean executaOpcao(int opcao, String fileName) {
    switch (opcao) {
        case 1 -> Menu.cadastraPessoaEmArquivo(fileName);
        case 2 -> Menu.listaPessoasNoArquivo(fileName);
        case 3 -> Menu.buscaPessoaEmArquivoPorCpf(fileName);
        case 4 -> {
            return Menu.encerraMenu();
        }
        default -> JOptionPane.showMessageDialog(null, "Opção inválida");
    }

    return true;
}
