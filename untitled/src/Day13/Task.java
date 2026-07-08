package Day13;
import java.util.*;
import java.util.stream.Collectors;
public class Task{
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // 1. Find all even numbers
        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even Numbers: " + even);

        // 2. Find all odd numbers
        List<Integer> odd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println("Odd Numbers: " + odd);

        // 3. Multiply each number by 2
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("Doubled: " + doubled);

        // 4. Find numbers greater than 25
        List<Integer> greaterThan25 = numbers.stream()
                .filter(n -> n > 25)
                .toList();
        System.out.println("Greater than 25: " + greaterThan25);

        // 5. Count total numbers
        long count = numbers.size();
        System.out.println("Count: " + count);

        // 6. Find sum of all numbers
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);

        // 7. Find max and min
        java.util.Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        java.util.Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Max: " + max.orElse(0));
        System.out.println("Min: " + min.orElse(0));

        // 8. Convert all numbers to String
        List<String> stringNumbers = numbers.stream()
                .map(String::valueOf)
                .toList();
        System.out.println("String Numbers: " + stringNumbers);

        List<String> names = Arrays.asList("Sekhar", "Amit", "Anita", "Ravi", "Suman", "Ajay");

        // 9. Names starting with "A"
        List<String> startsWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("Starts with A: " + startsWithA);

        // 10. Names ending with "i"
        List<String> endsWithI = names.stream()
                .filter(name -> name.endsWith("i"))
                .toList();
        System.out.println("Ends with i: " + endsWithI);

        // 11. Convert all names to uppercase
        List<String> upperCase = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase: " + upperCase);

        // 12. Sort names alphabetically
        List<String> alphabetical = names.stream()
                .sorted()
                .toList();
        System.out.println("Alphabetical: " + alphabetical);

        // 13. Sort names by length
        List<String> byLength = names.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
        System.out.println("Sorted by Length: " + byLength);

        // 14. Find first name starting with "S"
        java.util.Optional<String> firstS = names.stream()
                .filter(name -> name.startsWith("S"))
                .findFirst();
        System.out.println("First Name Starting with S: " + firstS.orElse("Not Found"));

        // 15. Check if any name starts with "R"
        boolean anyR = names.stream()
                .anyMatch(name -> name.startsWith("R"));
        System.out.println("Any Name Starts with R: " + anyR);

        // 16. Check if all names have length > 3
        boolean allGreaterThan3 = names.stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("All Names Length > 3: " + allGreaterThan3);
    }
}