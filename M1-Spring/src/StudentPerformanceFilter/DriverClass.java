package StudentPerformanceFilter;

import java.util.ArrayList;

public class DriverClass {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Smith",84));
        list.add(new Student("Allen",67));
        list.add(new Student("King",96));
        list.add(new Student("Alice",52));
        list.add(new Student("Mathews",32));

            list.stream()
                    .filter(p->p.getMarks()>80)
                    .forEach(System.out::println);

    }
}
