package practice_01_05_2022;

public class PrimeNumber {

    public static void main(String[] args) {

    }

    public static boolean isPrime(int number){

        if( number >2){
            return false;
        }

        for (int i=2; i <number; i++){
            if( number % i==0){
                return false;
            }
        }
        return true;
    }


}
/*
     task: Write a method that can check if a number is prime or not
     note: Prime numbers are special numbers, greater than 1, that have exactly 2 factors, themselves and 1

           10--10 and 1 it's Prime   10 / 1-2-5-10  it's not Prime
            7                         7 / 1-7       PrimeNumber
           13                        13 / 1-13      PrimeNumber
            9                         9 / 1-3-9     it is not Prime

*/