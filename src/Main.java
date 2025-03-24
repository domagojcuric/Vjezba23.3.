import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Unesite d1ljinu pravokutnika: ");
        double duljina = Double.parseDouble(input.nextLine());

        System.out.print("Unesite sirinu pravokutnika: ");
        double sirina = Double.parseDouble(input.nextLine());

        double povrsina = duljina * sirina;

        System.out.println("Povrsina pravokutnika je : " + povrsina);

        input.close();

        }
    }