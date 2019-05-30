package a_25_5;

import java.util.Scanner;

public class pallidrome {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar :");
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();
        int varDigit = 0;
        int numarOriginal = numar;
        System.out.println("numar  " + numar);
        while (numar != 0) {
            int ultimDigit = numar % 10;
            System.out.println("ultim digit  " + ultimDigit);
            varDigit = (varDigit * 10) + ultimDigit;
            System.out.println("varDigit  " + varDigit);
            numar = numar / 10;
            System.out.println("numar la final  " + numar);

        }
        if (numarOriginal == varDigit) {
            System.out.println("PALLINDROME");
        } else {
            System.out.println("NUMARUL NU E PALLINDROME");
        }
    }
}
