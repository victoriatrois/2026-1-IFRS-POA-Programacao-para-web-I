public class Main {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        Pessoa bia = new Pessoa("Beatriz", "51992048273", "Rua dos Amigos");

        System.out.println(eu.toString());
        System.out.println(bia.toString());

        Estudante estudante = new Estudante();
        System.out.println(estudante.toString());

        // essa forma __ mais tempo de processamento
        Cpf cpfDoEstudante2 = new Cpf(776662112L, 12);
        Estudante estudante2 = new Estudante("nome do estudante", "telefone do estudante", "endereço do estudante", 28329083038L, "curso do aluno", 1, cpfDoEstudante2);
        System.out.println(estudante2.toString());

        // na web é melhor instanciar o objeto direto na passagem de parâmetros
        Estudante estudante3 = new Estudante(
            "nome do estudante",
            "telefone do estudante",
            "endereço do estudante",
            28329083038L,
            "curso do aluno",
            1,
            new Cpf(827362623L, 83)
        );

        System.out.println(estudante3.toString());
    }
}
