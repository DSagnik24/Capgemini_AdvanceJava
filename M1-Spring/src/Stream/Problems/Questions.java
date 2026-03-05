package Stream.Problems;


import Stream.Student;

import java.util.List;

public class Questions {
    public static void main(String[] args) {
        List<Students> students  = List.of(
                new Students("RAM",  20),
                new Students("HARI", 17),
                new Students("SITA",  25)
        );

        System.out.println(students.toString());

        //2
        long count = students.stream()
                .filter(s->s.getAge()>18)
                .count();
        System.out.println(count);

        //3
        List<Students> res2 = students.stream()
                .filter(s -> s.getAge()> 18 && s.getAge()<40)
                .map(s -> new Students(s.getName(), s.getAge() * 2))
                .toList();

        System.out.println(res2.toString());

        //4
        List<Students> minor = students.stream()
                .filter(s->s.getAge()<18)
                .toList();
        System.out.println(minor.toString());

        //5
        int adultageSum = students.stream()
                .filter(s->s.getAge()>18)
                .map(Students::getAge)
                .reduce(0,Integer::sum);

        System.out.println(adultageSum);

        //6
        boolean match =
                students.stream()
                        .anyMatch(s->s.getAge()>18);
        System.out.println(match);

    }
}
