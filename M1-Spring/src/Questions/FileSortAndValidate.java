package Questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileSortAndValidate {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src/Questions/numbers.txt";
        List<Integer> numbers = new ArrayList<>();
        List<Integer> invalidLines = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            int lineNo = 1;
            while((line = br.readLine()) != null){
                try{
                    int val = Integer.parseInt(line.trim());
                    numbers.add(val);
                } catch (NumberFormatException e) {
                    invalidLines.add(lineNo);
                }
                lineNo++;
            }
        } catch (IOException e) {
            System.out.println("Error reading files: "+e.getMessage());
            return;
        }

        if(!invalidLines.isEmpty()){
            System.out.println("Invalid data on lines: ");
            for(int i=0;i<invalidLines.size();i++){
                System.out.print(invalidLines.get(i)+" ");
            }
            System.out.println();
        }

        Set<Integer> set = new TreeSet<>();

        for(int i:set){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}
