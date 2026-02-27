# Revisão de Orientação a Objetos

## Classe vs. Objetos

- Classe: um modelo que serve de base para a criação de objetos
dividido entre estado (atributos) e ações (métodos)

- Objeto: instância concreta do objeto

## Abstração

## Herança e composição de objetos

### Herança

Sabemos que a uma classe herda de outra ao perguntas:
É um... `<subclasse>` é um `<superclasse>`?


protegido: tudo que está na super a sub consegue ver (OO)
> além disso todas as classes no mesmo pacote conseguem ver (java)

Para sabermos se uma classe consegue chamar um método, olhamos para os seus métodos, depois para os da sua super classe e assim sucessivamente até chegarmos na classe object:

`https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html`

Polimorfismo de sobrecarda é quando declaramos um método com o mesmo nome mudando apenas a sua assinatura (parâmetros de tipos diferentes).


Polimorsismo em variáveis - variáveis polimórficas


Relacionamento de composição
Um objeto usa como ___ um outro

TODO: atividade da semana 1