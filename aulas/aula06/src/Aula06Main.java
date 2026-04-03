//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // 1.1 Você está desenvolvendo um sistema de e-commerce e precisa exibir uma lista de produtos.
    // Implemente a funcionalidade para ordenar esses produtos tanto em ordem crescente quanto decrescente de preço.

    // Crie uma classe Produto com os atributos id (int), nome (String) e preco (double).
    // Crie uma List<Produto> e adicione pelo menos 5 produtos.
    // Ordene a lista de produtos por preco em ordem crescente.
    // Ordene a lista de produtos por preco em ordem decrescente.
    // Utilize Collections.sort() ou o método sort() da List com Comparator.
    ComparadorDePrecosDesc comparaPrecoDesc = new ComparadorDePrecosDesc();
    List<Produto> estoqueDeLeite = new ArrayList<>();

    Produto santaClara = new Produto(1, "leite desnatado Santa Clara", 6.49f);
    Produto leitissimo = new Produto(2, "leite zero lactose Leitíssimo", 9.99f);
    Produto elege = new Produto(3, "leite integral Elegê", 5.59f);
    Produto nude = new Produto(4, "leite vegetal de aveia e baunilha Nude",13.98f);
    Produto adesDeSoja = new Produto(5, "bebida vegetal de soja", 8.90f);

    estoqueDeLeite.add(santaClara);
    estoqueDeLeite.add(leitissimo);
    estoqueDeLeite.add(elege);
    estoqueDeLeite.add(nude);
    estoqueDeLeite.add(adesDeSoja);

//    for (Produto leite : estoqueDeLeite) {
//        System.out.println(leite.toString());
//    }

    Collections.sort(estoqueDeLeite);
    System.out.println("Ordem CRESCENTE");
    System.out.println(estoqueDeLeite);

    System.out.println("Ordem deCRESCENTE");
    Collections.sort(estoqueDeLeite, new ComparadorDePrecosDesc());
    System.out.println(estoqueDeLeite);

    Collections.sort(estoqueDeLeite, new ComparadorDePrecosDesc() {
        @Override
        public int compare(Produto produto1, Produto produto2) {
            if (produto1.getPreco() > produto2.getPreco()) return -1;
            if (produto1.getPreco() == produto2.getPreco()) return 0;
            return 1;
        }
    });


    // 2.2
    //    Você tem dois conjuntos de usuários (por exemplo, usuários ativos e usuários premium) e precisa encontrar quais
    //    usuários estão presentes em ambos os conjuntos. O resultado deve ser exibido em ordem alfabética.

    // Crie dois Set<String> (nomes de usuários).
    // Encontre a interseção dos dois conjuntos (elementos comuns).
    // O resultado da interseção deve ser armazenado e exibido em ordem alfabética.

    Set<String> usuariosAtivos = new HashSet<>(Arrays.asList("Alice", "Bob", "Carla"));
    Set<String> usuariosPremium = new HashSet<>(Arrays.asList("Alice", "Eve", "Maria"));

    // Encontra a intersecção dos dois conjuntos (armazena a intersecção no objeto que chamou o método)
    usuariosAtivos.retainAll(usuariosPremium);
    System.out.println("INTERSECÇÃO");
    System.out.println(usuariosAtivos);

    // Tratamento de exceções
    // Ocorrência que altera o curso normal do programa
    // Problemas comuns:
    //  * NullPointerException
    //  * ArrayIndexOutOfBounds
    //  * FileNotFoundException
    // Throwable - Error - AWTError
    //           |       - VirtualMachineError
    //           |
    //           - Exception - IOException
    //                       - RunTimeException - ClassCastException
    //                                          - NoSuchElementexception
    //                                          - NullPointerException
    //                                          - ArithmeticException
    //                                          - IndexOutOfBoundsException - ArrayIndexOutOfBounds

}
