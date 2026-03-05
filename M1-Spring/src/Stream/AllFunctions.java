package Stream;

import java.util.List;
import java.util.Optional;

public class AllFunctions {
    public static void main(String[] args) {

        List<Student> students  = List.of(
                new Student("ANIK", 65, 20),
                new Student("ARJUN", 75, 22),
                new Student("ANJANA", 75, 22),
                new Student("RAHUL", 60, 19),
                new Student("ROHAN", 60, 21),
                new Student("ZARA", 85, 24),
                new Student("RAM", 85, 23),
                new Student("AMIT", 90, 21),
                new Student("SAGNIK", 90, 22),
                new Student("HARI", 45, 20),
                new Student("ANAGHA", 65, 20),
                new Student("AGNES", 65, 22),
                new Student("AGNIK", 75, 21),
                new Student("SITA", 80, 19),
                new Student("AYAN", 80, 21)
        );
        //toList
        List<Student> adults =
                students.stream()
                        .filter(s->s.getAge() > 10)
                        .toList();
        System.out.println(adults);

        //forEach
        students.stream()
                .forEach(s-> System.out.println(s.getName()));

        //count
        long count =
                students.stream()
                        .filter(s->s.getAge()>18)
                        .count();
        System.out.println(count);

        // findFirst
        Optional<Student> first =
                students.stream()
                        .filter(s -> s.getAge() > 18)
                        .findFirst();

        first.ifPresent(s -> System.out.println("First Adult: " + s.getName()));

        // allMatch
        boolean allAdults =
                students.stream()
                        .allMatch(s -> s.getAge() > 18);

        System.out.println("All adults: " + allAdults);


        //anyMatch
        boolean anyMinor=
                students.stream()
                        .anyMatch(s->s.getAge()<18);


        //noneMatch
        boolean noneSenior =
                students.stream()
                        .noneMatch(s->s.getAge()>60);

        //reduce
        int totalAge =
                students.stream()
                        .map(Student::getAge)
                        .reduce(0,Integer::sum);

    }
}
