import java.util.Scanner;

public class OIB {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite OIB");
        String oib = input.nextLine();

        for(int i = 0 ; i<oib.length(); i++) {
            int znamenka = Character.getNumericValue(oib.charAt(i));
            
            System.out.println(znamenka);
        }




        input.close();


    }

}
