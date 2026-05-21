import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 10, 20, 30, 40,60,56,99);

        nums.stream()
                .filter(num -> num % 2 == 0)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
