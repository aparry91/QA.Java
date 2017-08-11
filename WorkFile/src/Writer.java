import java.io.*;
import java.util.*;


public class Writer {

    public Writer(){
    }

    public void WriteOutput(List<Person> peopleArr) {
        try {
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter("C:/Users/Administrator/Desktop/personList.txt"));
        for (Person p : peopleArr) {

            fileWrite.write(p.toString());
        }
        fileWrite.close();
    } catch (IOException ex) {
       ex.printStackTrace();
    }
}

    public void ReadFile() throws IOException {

        BufferedReader inFile = new BufferedReader(new FileReader("C:/Users/Administrator/Desktop/personList.txt"));

        ArrayList<String> fileArr = new ArrayList<String>();

        String storeLine;
        while ((storeLine = inFile.readLine()) != null)
        {
            fileArr.add(storeLine);
        }
        System.out.println(fileArr);
        inFile.close();
    }

}