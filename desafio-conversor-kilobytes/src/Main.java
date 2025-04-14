public class Main {
    public static void main(String[] args) {

        // Ao passar uma quantidade de kiloBytes para o método "printMegaBytesAndKiloBytes", ele se encarrega de calcular quantos MBs e KBs são gerados. O código usa o operador "%" pra extrair a quantidade restante de KBs depois da conversão.
        printMegaBytesAndKiloBytes(100000);
        printMegaBytesAndKiloBytes(400);
        printMegaBytesAndKiloBytes(-10000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kiloBytes + " KB = " + (kiloBytes/1024) + " MB and " + (kiloBytes%1024) + " KB");
    }
}