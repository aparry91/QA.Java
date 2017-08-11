import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        Writer w = new Writer();
        List<Person> peopleArr = new ArrayList<>();

        Person p1 = new Person("Adam", "Consultant", 26);
        Person p2 = new Person("Dev", "Scala Developer", 21);
        Person p3 = new Person("Jon", "VR Game Developer", 26);
        Person p4 = new Person("Shaun", "English Teacher", 28);
        Person p5 = new Person("Jack", "Consultant", 22);

        peopleArr.add(p1);
        peopleArr.add(p2);
        peopleArr.add(p3);
        peopleArr.add(p4);
        peopleArr.add(p5);
        System.out.println(peopleArr);
        w.WriteOutput(peopleArr);
        w.ReadFile();

        }
    }

