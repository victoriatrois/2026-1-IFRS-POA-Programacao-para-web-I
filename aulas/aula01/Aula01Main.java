package aula01;

public class Aula01Main {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.setNome("Victoria");
        eu.setTelefone("51992048273");
        eu.setEndereco("Rua dos Amigos");

        Pessoa bia = new Pessoa("Beatriz", "51992048273", "Rua dos Amigos");

        System.out.println("Pessoa criada com construtor vazio + setters:");
        System.out.println(eu);

        System.out.println("\nPessoa criada com construtor completo:");
        System.out.println(bia);

        Estudante estudanteSemCpf = new Estudante();
        estudanteSemCpf.setNome("Aluno sem CPF");
        estudanteSemCpf.setCurso("Sistemas para Internet");

        System.out.println("\nEstudante com dados parciais:");
        System.out.println(estudanteSemCpf);

        Cpf cpfDoEstudante = new Cpf(776662112L, 12);
        Estudante estudanteComCpf = new Estudante(
                "Nome do estudante",
                "51999999999",
                "Endereco do estudante",
                28329083038L,
                "Curso do aluno",
                1,
                cpfDoEstudante
        );

        System.out.println("\nEstudante com composicao de CPF:");
        System.out.println(estudanteComCpf);

        Estudante estudanteComCpfDireto = new Estudante(
                "Outro estudante",
                "51888888888",
                "Outro endereco",
                28329083039L,
                "Curso do aluno",
                1,
                new Cpf(827362623L, 83)
        );

        System.out.println("\nEstudante com CPF criado direto no construtor:");
        System.out.println(estudanteComCpfDireto);
    }
}

