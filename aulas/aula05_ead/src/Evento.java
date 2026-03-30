// Crie uma classe Evento com atributos
//   nome,
//   data,
//   um organizador, que
//    deve ser uma pessoa.
//   participantes que
//    devem ser armazenados em um conjunto e
//  atividades que
//     devem ser armazenadas em uma lista
//  Os participantes devem estar ordenados pelo nome em ordem ascendente A -> Z
//  A classe Evento deve ter métodos para
//   adicionarParticipante(Participante p),
//   removerParticipante(String cpf),
//   adicionarAtividade(Atividade a) e
//   listarAgenda(), em que todos os eventos devem ser listados

import Excecoes.ConflitoDeHorario;
import Excecoes.ParticipanteJaInscrito;
import Excecoes.ParticipanteNaoEncontrado;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.TreeSet;

public class Evento {
    private String nome;
    private LocalDateTime data;
    private Pessoa organizador;
    private TreeSet<Participante> participantes;
    private ArrayList<Atividade> atividades;

    public Evento() {
    }

    public Evento(String nome, LocalDateTime data, Pessoa organizador, TreeSet<Participante> participantes, ArrayList<Atividade> atividades) {
        this.nome = nome;
        this.data = data;
        this.organizador = organizador;
        this.participantes = participantes;
        this.atividades = atividades;
    }

    public String getNome() {
        return nome;
    }

    public TreeSet<Participante> getParticipantes() {
        return participantes;
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    @Override
    public String toString() {
        String dataPorExtenso = (data != null) ? data.toString() : "Data não cadastrada";
        String participantesInscritos = (participantes != null) ? participantes.toString() : "Nenhum participante cadastrado";
        String atividadesCadastradas = (atividades != null) ? atividades.toString() : "Nenhuma atividade cadastrada";

        return String.format("""
                Evento: %s
                Data: %s
                Organizador: %s
                Participantes: %s
                Atividades: %s
                """, nome, dataPorExtenso, organizador, participantesInscritos, atividadesCadastradas);
    }

    // Ao adicionar um participante, verifique se ele já está inscrito.
    public void adicionaParticipante(Participante novoParticipante) throws ParticipanteJaInscrito {
        for (Participante participante : participantes) {
            if (participante.getCpf().equals(novoParticipante.getCpf())) {
                throw new ParticipanteJaInscrito(
                        "Já há um participante inscrito com o CPF informado."
                );
            }
        }
        participantes.add(novoParticipante);
    }

    private void removeParticipante(String cpf) throws ParticipanteNaoEncontrado {
        for (Participante participante : participantes) {
            if (participante.getCpf().toString().equals(cpf)) {
                participantes.remove(participante);
                return;
            }
        }
        throw new ParticipanteNaoEncontrado(
                "Não há inscritos para o CPF informado."
        );
    }

    // Ao adicionar uma atividade, verifique se não há conflito de horário com outras atividades
    public void adicionaAtividade(Atividade novaAtividade) throws ConflitoDeHorario {
        for (Atividade atividadeExistente : atividades) {
            if (atividadesConflitam(atividadeExistente, novaAtividade)) {
                throw new ConflitoDeHorario(
                        String.format("""
                                %s conflita com %s
                                """, novaAtividade, atividadeExistente)
                );
            }
        }
        atividades.add(novaAtividade);
    }

    // deve listar todos os eventos
    void listaAgenda() {
        int numeroDaAtividade = 0;

        for (Atividade atividade : atividades) {
            System.out.printf("\nAtividade %d\n", numeroDaAtividade);
            System.out.println(atividade.toString());

            numeroDaAtividade++;
        }

    }

    public boolean atividadesConflitam(Atividade atividadeExistente, Atividade novaAtividade) {
        int horaDeInicioDaAtividadeExistente = atividadeExistente.getHorario().getHour();
        int minutoDeInicioDaAtividadeExistente = atividadeExistente.getHorario().getMinute();
        int inicioDaAtividadeExistente = horaDeInicioDaAtividadeExistente * 60 + minutoDeInicioDaAtividadeExistente;
        int fimDaAtividadeExistente = inicioDaAtividadeExistente + atividadeExistente.getDuracaoEmMinutos();

        int horaDeInicioDaNovaAtividade = novaAtividade.getHorario().getHour();
        int minutoDeInicioDaNovaAtividade = novaAtividade.getHorario().getMinute();
        int inicioDaNovaAtividade = horaDeInicioDaNovaAtividade * 60 + minutoDeInicioDaNovaAtividade;
        int fimDaNovaAtividade = inicioDaNovaAtividade + novaAtividade.getDuracaoEmMinutos();

        return ! (fimDaAtividadeExistente <= inicioDaNovaAtividade || fimDaNovaAtividade <= inicioDaAtividadeExistente);
    }
}
