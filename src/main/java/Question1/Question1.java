package Question1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question1 {
   public static void main(String[]args){
       int[] numbers = new int[50];
       IntStream.range(1,51).forEach(i->{
           numbers[i-1]= i;
       });

       Integer result=Arrays.stream(numbers)
       .reduce(0, (a,b) -> a+b);
       System.out.println("The sum of integer array containing numbers from 1 to 50 is:  " + result);
   }
}
