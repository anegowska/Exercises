package edabit;

//Create a method that returns true if a number is prime and false if it's not.

public class PrimeNumber {

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num/2; i++) {

            if (num % i == 0 ) {
                    return false;
                }
        }
        return true;
    }
}
