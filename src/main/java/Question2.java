import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Question2 {
    public static void main(String[] args) {
        Supplier<Integer> primeNumbers = () -> {
            int twoDigitPrimeNumbers = 0;
            while (true) {
                int randomNumber = (int) (Math.random() * ((100 - 10) + 1)) + 10;
                if (IntStream.range(2, randomNumber).noneMatch(v -> randomNumber % v == 0)) {
                    twoDigitPrimeNumbers = randomNumber;
                    break;
                }
            }
            return twoDigitPrimeNumbers;
        };
        System.out.print("The two digit prime number that is generated randomly is: "+primeNumbers.get());
    }
    }
