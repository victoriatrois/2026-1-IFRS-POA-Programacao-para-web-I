import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.TreeSet;

public class Aula05Main {

    static void main(String[] args) {
        String[] opcoes = {"Demonstração (Teste Básico)", "Menu Interativo", "Sair"};

        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha qual modo você deseja executar:",
                "SISTEMA DE GERENCIAMENTO DE EVENTOS",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (escolha == JOptionPane.CLOSED_OPTION || escolha == -1 || escolha == 2) {
            System.exit(0);
        }

        if (escolha == 0) {
            demonstracaoBasica();
        } else if (escolha == 1) {
            menuInterativo();
        }
    }

    static void demonstracaoBasica() {
        System.out.println("=== DEMONSTRAÇÃO: TESTE BÁSICO ===\n");

        Cpf cpfJoao = new Cpf(12345678, 90);
        Cpf cpfMaria = new Cpf(98765432, 10);
        Cpf cpfPedro = new Cpf(55555555, 55);
        Cpf cpfAna = new Cpf(11111111, 11);
        Cpf cpfCarlos = new Cpf(22222222, 22);

        Pessoa organizador = new Pessoa("João Silva", "joao@email.com", cpfJoao);
        Palestrante palestrante1 = new Palestrante("Maria Santos", "maria@email.com", cpfMaria, "Desenvolvimento Web");
        Palestrante palestrante2 = new Palestrante("Pedro Costa", "pedro@email.com", cpfPedro, "Banco de Dados");
        Participante participante1 = new Participante("Ana Oliveira", "ana@email.com", cpfAna);
        Participante participante2 = new Participante("Carlos Mendes", "carlos@email.com", cpfCarlos);

        System.out.println("--- DADOS CADASTRADOS ---\n");
        System.out.println("Organizador:\n" + organizador);
        System.out.println("Palestrante 1:\n" + palestrante1);
        System.out.println("Palestrante 2:\n" + palestrante2);

        LocalDateTime dataEvento = LocalDateTime.of(2026, 4, 15, 8, 0);
        Evento evento = new Evento(
                "Conferência de Tecnologia 2026",
                dataEvento,
                organizador,
                new TreeSet<>(),
                new ArrayList<>()
        );

        System.out.println("\n--- EVENTO CRIADO ---");
        System.out.println("Evento: " + evento.getNome());

        LocalDateTime horarioPalestra1 = LocalDateTime.of(2026, 4, 15, 9, 0);
        LocalDateTime horarioPalestra2 = LocalDateTime.of(2026, 4, 15, 10, 30);
        LocalDateTime horarioSessao = LocalDateTime.of(2026, 4, 15, 14, 0);

        Palestra palestra1 = new Palestra("Introdução ao Java", horarioPalestra1, 60, palestrante1, 101);
        Palestra palestra2 = new Palestra("Design de Banco de Dados", horarioPalestra2, 90, palestrante2, 102);

        ArrayList<Palestrante> palestrantesInterativos = new ArrayList<>();
        palestrantesInterativos.add(palestrante1);
        palestrantesInterativos.add(palestrante2);

        SessaoInterativa sessao = new SessaoInterativa("Painel: Futuro da Tecnologia", horarioSessao, 120, palestrantesInterativos, 50);

        System.out.println("\n--- ADICIONANDO ATIVIDADES ---\n");

        try {
            evento.adicionaAtividade(palestra1);
            System.out.println("✓ Palestra 1 adicionada");
        } catch (Exception e) {
            System.out.println("✗ Erro: " + e.getMessage());
        }

        try {
            evento.adicionaAtividade(palestra2);
            System.out.println("✓ Palestra 2 adicionada");
        } catch (Exception e) {
            System.out.println("✗ Erro: " + e.getMessage());
        }

        try {
            evento.adicionaAtividade(sessao);
            System.out.println("✓ Sessão adicionada");
        } catch (Exception e) {
            System.out.println("✗ Erro: " + e.getMessage());
        }

        // Testar conflito de horário
        try {
            LocalDateTime horarioConflito = LocalDateTime.of(2026, 4, 15, 9, 30);
            Palestra palestraConflitante = new Palestra("Workshop Conflitante", horarioConflito, 60, palestrante1, 103);
            evento.adicionaAtividade(palestraConflitante);
        } catch (Exception e) {
            System.out.println("✗ Conflito detectado: " + e.getMessage().split("\n")[0]);
        }

        System.out.println("\n--- ADICIONANDO PARTICIPANTES ---\n");

        try {
            evento.adicionaParticipante(participante1);
            System.out.println("✓ " + participante1.getNome() + " inscrito");
        } catch (Exception e) {
            System.out.println("✗ Erro: " + e.getMessage());
        }

        try {
            evento.adicionaParticipante(participante2);
            System.out.println("✓ " + participante2.getNome() + " inscrito");
        } catch (Exception e) {
            System.out.println("✗ Erro: " + e.getMessage());
        }

        // Testar duplicado
        try {
            evento.adicionaParticipante(participante1);
        } catch (Exception e) {
            System.out.println("✗ Duplicado rejeitado: " + e.getMessage());
        }

        System.out.println("\n--- PARTICIPANTES (ORDENADOS) ---\n");
        for (Participante p : evento.getParticipantes()) {
            System.out.println(p);
        }

        System.out.println("\n--- AGENDA ---");
        evento.listaAgenda();

        System.out.println("\n=== FIM ===");
    }

    static void menuInterativo() {
        System.out.println("=== MENU INTERATIVO ===\n");

        GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();

        System.out.println("--- PRÉ-CADASTRANDO DADOS ---");
        gerenciador.cadastraPessoa("João Silva", "joao@email.com", 12345678, 90);
        gerenciador.cadastraPessoa("Maria Santos", "maria@email.com", 98765432, 10);
        gerenciador.cadastraPessoa("Ana Oliveira", "ana@email.com", 11111111, 11);
        System.out.println("✓ Pessoas cadastradas\n");

        Cpf cpfOrganizador = new Cpf(12345678, 90);
        Pessoa organizador = new Pessoa("João Silva", "joao@email.com", cpfOrganizador);

        LocalDateTime dataEvento = LocalDateTime.of(2026, 5, 20, 9, 0);
        gerenciador.criaEvento("Workshop de Java 2026", dataEvento, organizador);

        System.out.println("\n--- MENU ---");
        int opcao = 0;

        while (opcao != 5) {
            opcao = GerenciadorDeEventos.gerenciaEvento();

            if (opcao == -1 || opcao == JOptionPane.CLOSED_OPTION) {
                System.out.println("Operação cancelada. Encerrando...");
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    String nomeEvento = solicitarEntrada("Nome do evento:");
                    if (nomeEvento == null) break;

                    String dataStr = solicitarEntrada("Data (yyyy-MM-dd HH:mm):");
                    if (dataStr == null) break;

                    try {
                        String[] partes = dataStr.split(" ");
                        String[] data = partes[0].split("-");
                        String[] hora = partes[1].split(":");
                        LocalDateTime data2 = LocalDateTime.of(
                                Integer.parseInt(data[0]),
                                Integer.parseInt(data[1]),
                                Integer.parseInt(data[2]),
                                Integer.parseInt(hora[0]),
                                Integer.parseInt(hora[1])
                        );
                        gerenciador.criaEvento(nomeEvento, data2, organizador);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    String nomePesquisa = solicitarEntrada("Nome do evento para pesquisar:");
                    if (nomePesquisa == null) break;

                    System.out.println("\n--- PESQUISA DE EVENTO ---");
                    System.out.println("Buscando evento: " + nomePesquisa);
                    JOptionPane.showMessageDialog(null, "Evento '" + nomePesquisa + "' encontrado!");
                    break;

                case 3:
                    String nomeAgenda = solicitarEntrada("Nome do evento:");
                    if (nomeAgenda == null) break;

                    System.out.println("\n--- AGENDA ---");
                    gerenciador.listaAgendaDoEvento(nomeAgenda);
                    break;

                case 4:
                    String nomeParticipantes = solicitarEntrada("Nome do evento:");
                    if (nomeParticipantes == null) break;

                    System.out.println("\n--- PARTICIPANTES ---");
                    gerenciador.listaParticipantesDoEvento(nomeParticipantes);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }

        System.out.println("\n=== FIM ===");
    }

    private static String solicitarEntrada(String mensagem) {
        String entrada = JOptionPane.showInputDialog(mensagem);

        if (entrada == null) {
            System.out.println("Operação cancelada. Encerrando...");
            System.exit(0);
        }

        return entrada;
    }
}