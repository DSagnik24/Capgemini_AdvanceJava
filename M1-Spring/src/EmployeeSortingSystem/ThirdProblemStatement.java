package EmployeeSortingSystem;

import java.util.ArrayList;

public class ThirdProblemStatement {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Smith");
        list.add("Allen");
        list.add("John");
        list.add("King");
        list.add("Tyler");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
