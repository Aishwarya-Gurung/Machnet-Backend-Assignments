import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        List<String> people = Arrays.asList("Ajay", "aish", "Manya", "Amit", "Dharma", "summit", "Shreya");

        List<String> predicateExample = people.stream()
                .filter(name -> name.toLowerCase().startsWith("a") && name.length() < 5)
                .collect(Collectors.toList());
        System.out.println("The list of names of people whose name starts with “a” or “A” and has name length less than 5 is " + predicateExample);
    }
}
