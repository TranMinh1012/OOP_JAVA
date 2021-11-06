import java.util.*;
import java.util.stream.*;

public class PracticeStreamApi {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, -3, 4, 5, -6, 7, 8, -9, 10);
        System.out.print("Sum of elements in array is: ");
        System.out.println(array.stream().mapToInt(m->m).sum());
        System.out.print("First element smaller than 0 is: ");
        System.out.println(array.stream().filter(m->m < 0).limit(1).collect(Collectors.toList()));
        System.out.print("List of even elements is: ");
        array.stream().filter(m->m%2==0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.print("Array contain values of input multiplied by two is: ");
        array.stream().forEach(m -> System.out.print(m*2 + " "));
    }
}
