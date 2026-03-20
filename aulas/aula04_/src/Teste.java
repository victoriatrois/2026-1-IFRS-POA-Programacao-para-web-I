public class Teste {
    public static class Par <P, S>{
        private P primeiro;
        private S segundo;

        public Par(){}

        public Par(P p, S s) {
            primeiro = p;
            segundo = s;
        }

        public P getPrimeiro() {
            return primeiro;
        }

        public void setPrimeiro(P primeiro) {
            this.primeiro = primeiro;
        }

        public S getSegundo() {
            return segundo;
        }

        public void setSegundo(S segundo) {
            this.segundo = segundo;
        }

        @Override
        public String toString() {
            return "Par{" +
                    "primeiro=" + primeiro +
                    ", segundo=" + segundo +
                    '}';
        }
    }


    public static void main(String[] args) {

        var anotacoes = """
                E       Element
                K       Key
                V       Value
                T       Generic Type
                S, U    Aditional types
                ?       Wildcard
                N       Number
                """;
        Par<Integer, String> funcionario = new Par<>();
        funcionario.setPrimeiro(1);
        funcionario.setSegundo("Fulano");
        System.out.println(funcionario.toString());
        funcionario = new Par(2,
                "Beltrano");
        System.out.println(funcionario.toString());

        Par<Integer, Integer> ponto = new Par<>();
        ponto.primeiro = 1;
        ponto.segundo = 2;

        System.out.println(ponto);

        Par<Integer, Integer> ponto2 = new Par<>();
        ponto2.primeiro = 5;
        ponto2.segundo = 7;
        System.out.println(ponto2);
    }
}