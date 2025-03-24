import java.util.Scanner;

public class temperatura {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi temperaturu: ");
        double temperaturaC = scanner.nextDouble();


        double Far = (temperaturaC * ((double) 9 /5) + 32);
        double Kel = temperaturaC + 273.15;

        System.out.println("temperatura u Faranheitim je " + Far);
        System.out.println("temperatura u kelvinima je " + Kel);

        scanner.close();




    }

}
