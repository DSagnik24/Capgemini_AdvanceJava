package StudentPerformanceSortingSystem;

public class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo,String name,double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public double getMarks(){
        return marks;
    }
    public String toString(){
        return "RollNo: "+rollNo
                +",Name: "+name
                +",Marks: "+marks;
    }
    @Override
    public int compareTo(Student st){
        return (int) (st.marks-this.marks);
    }
}
