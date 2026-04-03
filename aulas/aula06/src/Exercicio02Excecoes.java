    public class Exercicio02Excecoes {
    void main() {
        Produto produtos[] = new Produto[5]; // produtos é um vetor de 5 posições
        produtos[0] = new Produto();
        produtos[2] = new Produto(1, "granola", 17.90f);

        try {
            for (int i = 0; i < produtos.length; i++) {
                System.out.println(produtos[i].toString()); // linha 08 original
            }
        } catch (NullPointerException exception) {
            System.out.println("A lista está nula.");
            System.out.println(exception.getMessage());

        } catch (Exception exception) {
            System.out.println("Exceção desconhecida.");
            System.out.println(exception.getMessage());
        }

        // Qual o nome da classe que foi lançada a exceção?
            //Exercicio01Excecoes

        // Qual o nome do método que foi lançada a exceção?
            // Produto.toString()
        // Qual a linha em que foi lançada a exceção?
            // linha 08
    }
}