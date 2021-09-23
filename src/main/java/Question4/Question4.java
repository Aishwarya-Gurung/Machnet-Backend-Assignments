package Question4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {
    public static void main (String[] args){
        List<List<Integer>> NumberList = Arrays.asList(
                Arrays.asList(1, 3, 5, 7, 9),
                Arrays.asList(2 , 4, 6, 8,10)
        );

        List<Integer> all = NumberList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(all.stream()
                .filter(e -> prime(e))
                .collect(Collectors.toList()));
    }

    public static Boolean prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            return true;
        }else{
            return false;
        }
    }
}
