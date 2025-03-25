import java.util.Scanner;

public class OIB {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite OIB");
        String oib = input.nextLine();

        //provjera duljine
        if(oib.length() == 11 ){
            boolean sviBrojeviZnamenke = true;
            //provjerava jesu li svi znakovi uneeni kao znamenke
            for(int i = 0 ; i < 11 ; i ++){
                if(Character.isDigit(oib.charAt(i))){
                    sviBrojeviZnamenke = false;
                    break;
                }
            }

            if (sviBrojeviZnamenke){

                //postavljanje zadnje znamenke kao kontrolne
                int kontrolnaZnamenka = Character.getNumericValue(oib.charAt(oib.length()-1));
                int suma = 0;

                //for petlja do predzadnje znamenke
                for (int i = 0 ; i < 10; i++){
                    //uzimanje trenutne znamenke
                    suma = suma +Character.getNumericValue(oib.charAt(i));
                    suma = suma % 10;
                    if (suma == 0 ){
                        suma = 10;
                    }

                    suma = suma * 2;
                    suma = suma % 11;
                }

                int kontrolniBroj = (11 - suma);
                if(kontrolniBroj == 10){
                    kontrolniBroj = 0;
                }

                if (kontrolniBroj == kontrolnaZnamenka){
                    System.out.println("oib je valjan");
                }else {
                    System.out.println("oib nije valjan");
                }
            }
        }else {
            System.out.println("oib nije valjan");
        }
        input.close();
    }
}
