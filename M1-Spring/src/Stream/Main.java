package Stream;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Comparator;
import java.util.List;


public class Main{
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("ANIK", 65, 20),
                new Student("ARJUN", 75, 22),
                new Student("ANJANA", 75, 22),
                new Student("RAHUL", 60, 19),
                new Student("ROHAN", 60, 21),
                new Student("ZARA", 85, 24),
                new Student("TINA", 85, 23),
                new Student("AMIT", 90, 21),
                new Student("SAGNIK", 90, 22),
                new Student("PRIYA", 45, 18),
                new Student("KARAN", 45, 20),
                new Student("ANAGHA", 65, 20),
                new Student("AGNES", 65, 22),
                new Student("AGNIK", 75, 21),
                new Student("AARAV", 80, 19),
                new Student("AYAN", 80, 21),
                new Student("ABHISHEK", 80, 22),
                new Student("BISWA", 55, 20),
                new Student("CHARLIE", 70, 23),
                new Student("DEV", 95, 24)
        );
        List<Student> passes = students.stream()
                .filter(s->s.name.startsWith("A"))
                .filter(s->s.name.toLowerCase().contains("gn"))
                .toList();

        for (Student s : passes) {
            System.out.println(s.toString());
        }

        List<Student> res = students.stream()
                .filter(s -> s.marks > 75)
                .toList();

        List<Student> res2 = students.stream()
                .filter(s -> s.age > 35)
                .map(s -> new Student(s.name, s.marks * 2, s.age))
                .toList();

        System.out.println(res.size());

        for (Student s : res2) {
            System.out.println(s.toString());
        }

        System.out.println();

        List<Student> sorting = students.stream()
                .sorted(Comparator.comparingInt((Student s) ->s.marks)
                        .thenComparing(s->s.name))

                .toList();

        System.out.println(sorting.toString());
    }
}
