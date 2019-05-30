package a_25_5;

import java.util.ArrayList;
import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti numarul :  ");
        int no = sc.nextInt();
        ArrayList<Integer> ListaNrPrime = new ArrayList<>();
        int nr = no;
        for (int x = 2; x <= nr; x++) {
            boolean ePrim = true;
            for (int y = 2; y < x; y++)
                if (x % y == 0) {
                    ePrim = false;
                    break;
                }

            if (ePrim)
                ListaNrPrime.add(x);
        }
        System.out.println(ListaNrPrime);
    }

}
