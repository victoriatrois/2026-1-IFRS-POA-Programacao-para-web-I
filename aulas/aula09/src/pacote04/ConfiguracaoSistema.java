package pacote04;

public final class ConfiguracaoSistema {
    public static final String NOME_SISTEMA = "Sistema de Gestão";
    public final int VERSAO = 1;

    public final void exibirConfiguracao() {
        System.out.println("Sistema: " + NOME_SISTEMA + ", Versão: " + VERSAO);
    }
}
