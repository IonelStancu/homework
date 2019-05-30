package a_25_5;

import java.util.Scanner;

public class maxDigit {public static void main(String[] args) {
    ;



    int digit, numar;
    int mDigit = 67540;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number :");
    numar = sc.nextInt();

    while (numar > 0) {
        digit = numar % 10;
        if (mDigit < digit) {
            mDigit = digit;
        }
        numar = numar / 10;
    }

    System.out.println("cel mai mare digit este :" + mDigit);
}



}
