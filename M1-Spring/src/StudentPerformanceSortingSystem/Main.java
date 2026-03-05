package StudentPerformanceSortingSystem;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList<>();

        list.add(new Student(101,"Alice",85));
        list.add(new Student(102,"Bob",72));
        list.add(new Student(103,"Charlie",90));
        list.add(new Student(104,"Diana",78));

        System.out.println("Students before sorting: ");
        for(Student s: list){
            System.out.println(s);
        }
        Collections.sort(list);
        System.out.println("Students after sorting: ");
        for(Student s: list){
            System.out.println(s);
        }
    }
}
