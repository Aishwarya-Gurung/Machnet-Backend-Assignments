import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        List<String> people = Arrays.asList("Ajay", "aish", "Manya", "Amit", "Dharma", "summit", "Shreya");
        Predicate<String> begin = e -> e.toLowerCase().startsWith("a") && e.length()<=5 ;
        List<String> predicateExample = people.stream()
                .filter(e -> begin.test(e))
                .collect(Collectors.toList());
        System.out.println("The list of names of people whose name starts with “a” or “A” and has name length less than 5 is " + predicateExample);
    }
}
