import java.util.Scanner;

public class No2 {
    public static void checkArmStrong(int number){
        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            throw new RuntimeException(number+"BadRequestException");
    }


    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();
        checkArmStrong(input);
    }
}
