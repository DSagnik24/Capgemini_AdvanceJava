package FileHandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //It wont create a physical file, it just points to that path
        File file = new File("src/FileHandeling/Test.java");

        System.out.println("File object created");
        if(file.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File already exists");
        }
        //inserts data inside the file
        FileWriter writer = new FileWriter("test.java",true);
        writer.write("Sagnik");
        writer.close();
        System.out.println("Completed");
    }
}
