package a_25_5;

public class smallestWithFor {
    public static void main(String[] args) {
        //cel mai mic numar dintrun sir de numere
        int [] sir = {4,7,9,12,34,2,56};
        int nrMic = sir[0];


        for (int i=1; i<sir.length; i++) {
            if (sir[i] < nrMic) {
                nrMic = sir[i];
                System.out.println("cel mai mic e  " + nrMic);

            }
        }
    }
}
