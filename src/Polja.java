import java.util.Scanner;

public class Polja {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("koliko zelis prirodnih brojeva spremiti?");
        int broj = input.nextInt();

        int[] polje = new int[broj];

        System.out.println("Unesite " + broj + " brojeva:");
        for (int i = 0; i < broj; i++) {
            polje[i] = input.nextInt();
        }

        int min = polje[0];
        int max = polje[0];

        for (int i = 0; i < broj; i++) {
            if (polje[i] < min) {
                min = polje[i];
            }
            if (polje[i] > max) {
                max = polje[i];
            }
        }

        System.out.println("Najmanji broj u polju je: " + min);
        System.out.println("Najveći broj u polju je: " + max);

        input.close();


    }
}
