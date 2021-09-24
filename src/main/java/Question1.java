import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question1 {
    public static void main(String[]args){
        List<Integer> numbers = IntStream.rangeClosed(1, 50)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> primeNumbers = new ArrayList<>();

        Consumer< List<Integer> > oddList = list-> list.stream()
                                                   .filter(value ->value %2 !=0)
                                                    .forEach(oddNumbers::add);
        Consumer< List<Integer> > evenList = list->list.stream()
                                                .filter(value ->value %2 ==0)
                                                .forEach(evenNumbers::add);
        Consumer< List<Integer> > primeList = list->list.stream()
                                                   .filter(e->IntStream.range(2,e).noneMatch(v-> e % v == 0 ))
                                                   .filter(e-> e!= 1)
                                                   .forEach(primeNumbers::add);

        Consumer< List<Integer> > printLists = System.out::println;
        oddList.accept(numbers);
        evenList.accept(numbers);
        primeList.accept(numbers);

        //displaying odd number list.
        System.out.print("Odd numbers from 1 to 50 are as follows: ");
        printLists.accept(oddNumbers);

        //displaying even number list.
        System.out.print("Even numbers from 1 to 50 are as follows: ");
        printLists.accept(evenNumbers);

        //displaying prime number list.
        System.out.print("Prime numbers from 1 to 50 are as follows: ");
        printLists.accept(primeNumbers);
    }
}
