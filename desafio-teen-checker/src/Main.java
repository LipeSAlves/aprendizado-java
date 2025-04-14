public class Main {
    public static void main(String[] args) {
// O desafio propõe escrever um código que vê se, dentro de três números, um deles está entre 13 e 19, retornando "verdadeiro" caso positivo.
   System.out.println(hasTeen(12,13,20));
        System.out.println(hasTeen(-12,20,30));
        System.out.println(hasTeen(12,13,11));
        System.out.println(hasTeen(12,919,16));

    }

    public static boolean hasTeen(int a, int b, int c) {
        if ((isTeen(a)) || (isTeen(b)) || isTeen(c)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int a) {
        if ((a >= 13) && (a <= 19)) {
            return true;
        }
        return false;
    }
}