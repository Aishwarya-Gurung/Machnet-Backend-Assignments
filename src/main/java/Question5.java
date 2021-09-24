import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Question5 {
    public static void main(String []args) {
        List<Object> numbers =  new Random().ints(1,100)
                                .limit(10)
                                .boxed()
                                .sorted(Collections.reverseOrder())
                                .collect(Collectors.toList());
                                System.out.println(numbers);
    }
}
