public class FizzBuzz {
    public static void main (String[] args){

        for(int i=0 ; i < 101; i++){

            if (i % 3 == 0 && i % 5 == 0){
                if(i == 0){
                    System.out.println(i);
                    continue;
                }
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            }else {
                System.out.println(i);
            }

        }




    }


}
