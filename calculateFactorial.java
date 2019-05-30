package a_25_5;

import java.util.Scanner;

// Calculate and display the factorial of a given number n.
    public class calculateFactorial {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("intoduceti numarul:  ");
            int no = sc.nextInt();

            double noFact = 1;

            if (no <= 0) {
                noFact = 1;
            } else {

                for (int i = 1; i <= no; i++) {
                    noFact = noFact * i;


                }
                System.out.println(noFact);
            }
        }
    }
