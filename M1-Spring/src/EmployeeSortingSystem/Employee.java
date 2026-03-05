package EmployeeSortingSystem;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return "ID:"+id+", Name: "+name+", Salary:"+salary;
    }

    public int compareTo(Employee employee){
        return this.id - employee.id;
    }


}
