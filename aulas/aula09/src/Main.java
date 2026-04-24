import pacote04.ConfiguracaoSistema;

public static void main() {

    ConfiguracaoSistema config = new ConfiguracaoSistema();
    config.exibirConfiguracao();

    // Escreva certo ou errado
    ConfiguracaoSistema cs = new ConfiguracaoSistema();
    System.out.println(cs.VERSAO); // certo
//    System.out.println(cs.NOME_SISTEMA); // errado - algo da classe, deve ser acessado com a classe (variável de classe/atributo estático)
    System.out.println(ConfiguracaoSistema.NOME_SISTEMA); // certo
    cs.exibirConfiguracao();  // certo
//    ConfiguracaoSistema.exibirConfiguracao(); // errado: para ser acessado pela classe, deve ser método de classe/método estático
}
