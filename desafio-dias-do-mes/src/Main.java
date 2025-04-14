public class Main {
    public static void main(String[] args) {
        // O desafio proposito para o código abaixo é entregar a quantidade de dias de um determinado mês, considerando que em anos bissextos, o mês de fevereiro tem 29 dias. Abaixo estão elencados alguns testes!

        System.out.println(getDaysInMonth(2,2000)); // 2000 é um ano bissexto; logo, o código deve acusar 29 dias para o mês de fevereiro.
        System.out.println(getDaysInMonth(13,2000)); // Não existe 13º mês; deve acusar -1 como valor inválido.
        System.out.println(getDaysInMonth(-2,2000)); // Não existe um mês negativo; deve acusar -1 como valor inválido.
        System.out.println(getDaysInMonth(4,2000)); // 2000 é um ano bissexto, mas o mês de abril tem 30 dias.
        System.out.println(getDaysInMonth(2,2001)); // 2001 não é um ano bissexto, logo o mês de fevereiro deve acusar 28 dias.
        System.out.println(getDaysInMonth(5,99999)); // O ano inserido supera o limite, então o código deve retornar -1 como um valor inválido.
    }

    public static boolean isLeapYear (int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            }
            if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month,int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> {yield isLeapYear(year) ? 29 : 28;
            }
            default -> -1;
        };

    };

}