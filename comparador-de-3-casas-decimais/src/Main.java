public class Main {
    public static void main(String[] args) {
        // O desafio proposto para o próximo código é criar um método booleano que indica se dois números, quando reduzidos a três casas decimais, são iguais. Por exemplo: 3,1234 e 3,123 devem retornar "verdadeiro", pois são iguais quando aproximados para 3 casas decimais; assim como 3,0 e 3,000. Já 3,123 e 3,124 devem retornar "falso", pois não são iguais quando aproximados para 3 casas decimais.
        System.out.println(areEqualByThreeDecimalPlaces(3.123,3.1234));
        System.out.println(areEqualByThreeDecimalPlaces(3.000,3));
        System.out.println(areEqualByThreeDecimalPlaces(3.123,3.124));
        System.out.println(areEqualByThreeDecimalPlaces(3.123,-3.123));
    }
        public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
        // Ao multiplicar os números por 1000 (jogando 3 casas decimais para a direita) e converter os resultados para long através de casting (assim, aproximando eles para o número integral mais próximo), podemos comparar os resultados que, caso equivalentes, mostrarão se os dois números são iguais por 3 casas decimais.
            long aRounded = (long) (a * 1000);
            long bRounded = (long) (b * 1000);
            return aRounded == bRounded;
        }
    }
