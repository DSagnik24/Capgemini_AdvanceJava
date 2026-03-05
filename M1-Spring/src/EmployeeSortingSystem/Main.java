package EmployeeSortingSystem;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(201, "John", 50000.0));
        employees.add(new Employee(103, "Emma", 75000.0));
        employees.add(new Employee(150, "Liam", 62000.0));
        employees.add(new Employee(120, "Olivia", 58000.0));

        System.out.println("Employees before sorting: ");
        for (Employee e:employees){
            System.out.println(e);
        }

        Collections.sort(employees);

        System.out.println("Employees after sorting: ");
        for (Employee e:employees){
            System.out.println(e);
        }
    }
}
