// Crie uma classe GerenciadorEventos que usa
//  uma lista para guardar os eventos e
//  uma lista com todas as pessoas (todos os participantes e palestrantes).
// Nessa classe crie os seguintes métodos:
//  criarEvento,
//  cadastrarPessoa e
//  inscreverParticipanteEmEvento
// E um menu permite
//  cadastrarEvento,
//  pesquisar evento por nome,
//  listar agenda de um evento
//  listar todos os participantes do evento

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.TreeSet;

public class GerenciadorDeEventos {
    ArrayList<Evento> eventos;
    ArrayList<Pessoa> pessoasRegistradas;

    public GerenciadorDeEventos() {
        this.eventos = new ArrayList<>();
        this.pessoasRegistradas = new ArrayList<>();
    }

    public GerenciadorDeEventos(ArrayList<Evento> eventos, ArrayList<Pessoa> pessoasRegistradas) {
        this.eventos = eventos != null ? eventos : new ArrayList<>();
        this.pessoasRegistradas = pessoasRegistradas != null ? pessoasRegistradas : new ArrayList<>();
    }

    public void criaEvento(String nome, LocalDateTime data, Pessoa organizador) {
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório informar um nome para o evento.");
            return;
        }

        Evento novoEvento = new Evento(nome, data, organizador,
                new TreeSet<>(), new ArrayList<>());
        eventos.add(novoEvento);
        JOptionPane.showMessageDialog(
                null,
                String.format("""
                Evento %s criado com sucesso
                """, nome));
    }

    public void cadastraPessoa(String nome, String email, long numeroCpf, int digitoCpf) {
        if (nome == null || nome.isEmpty() || email == null || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório informar nome e e-mail para cadastrar alguém.");
            return;
        }

        for (Pessoa pessoa : pessoasRegistradas) {
            if (pessoa.getCpf().getNumero() == numeroCpf && pessoa.getCpf().getDigito() == digitoCpf) {
                JOptionPane.showMessageDialog(null, "Já existe pessoa cadastrada com este CPF.");
                return;
            }
        }

        try {
            Cpf novoCpf = new Cpf(numeroCpf, digitoCpf);
            Participante novaPessoa = new Participante(nome, email, novoCpf);
            pessoasRegistradas.add(novaPessoa);
            JOptionPane.showMessageDialog(null, String.format("""
                    Cadastro de %s realizado com sucesso.
                    """, nome));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar cadastro: " + e.getMessage());
        }
    }

    public void inscreveParticipanteEmEvento(String nomeEvento, String cpfParticipante) {
        Evento evento = procuraEventoPorNome(nomeEvento);
        if (evento == null) {
            JOptionPane.showMessageDialog(null, "Evento não encontrado.");
            return;
        }

        Participante participante = procuraParticipantePorCpf(cpfParticipante);
        if (participante == null) {
            JOptionPane.showMessageDialog(null, "Participante não encontrado.");
            return;
        }

        try {
            evento.adicionaParticipante(participante);
            JOptionPane.showMessageDialog(null,
                    String.format("""
                    Inscrição para %s em %s realizada com sucesso.
                    """, participante.getNome(), nomeEvento));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar inscrição: " + e.getMessage());
        }
    }

    private Evento procuraEventoPorNome(String nome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nome)) {
                return evento;
            }
        }
        return null;
    }

    private Participante procuraParticipantePorCpf(String cpf) {
        for (Pessoa pessoa : pessoasRegistradas) {
            if (pessoa.getCpf().toString().equals(cpf) && pessoa instanceof Participante) {
                return (Participante) pessoa;
            }
        }
        return null;
    }

    public void listaAgendaDoEvento(String nomeEvento) {
        Evento evento = procuraEventoPorNome(nomeEvento);

        if (evento == null) {
            JOptionPane.showMessageDialog(null, "Evento não encontrado.");
            return;
        }

        if (evento.getAtividades().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ainda não há nenhuma atividade cadastrada no evento informado.");
            return;
        }

        for (Atividade atividade : evento.getAtividades()) {
            if (atividade != null) {
                JOptionPane.showMessageDialog(null, atividade.toString());
            }
        }
    }

    public void listaParticipantesDoEvento(String nomeEvento) {
        Evento evento = procuraEventoPorNome(nomeEvento);
        if (evento == null) {
            JOptionPane.showMessageDialog(null, "Evento não encontrado.");
            return;
        }

        if (evento.getParticipantes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ainda não há nenhum participante cadastrado no evento informado.");
            return;
        }

        for (Participante participante : evento.getParticipantes()) {
            if (participante != null) {
                JOptionPane.showMessageDialog(null, participante.toString());
            }
        }
    }

    public static int gerenciaEvento() {
        String menu = """
                1. Cadastrar evento
                2. Pesquisar evento por nome
                3. Listar agenda de um evento
                4. Listar participantes de um evento
                5. Sair
                """;
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(menu));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
            return -1;
        }
    }
}
