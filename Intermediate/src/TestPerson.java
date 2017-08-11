import java.util.ArrayList;

public class TestPerson {



    public static void main (String [] args) {

        ArrayList<Person> arr = new ArrayList<>();

        Person p1 = new Person("Adam", 26, "Trainee Consultant");
        Person p2 = new Person("Dev", 21, "Trainee Consultant");
        Person p3 = new Person("Jack", 22, "Trainee Consultant");
        Person p4 = new Person("Mebin", 21, "Trainee Consultant");
        Person p5 = new Person("Jude", 22, "Trainee Consultant");
        Person p6 = new Person("Matthew", 22, "Trainee Consultant");

        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);
        arr.add(p6);

        for (Person i : arr) {
            System.out.println(i.toString());


        }
        search("Adam", arr);
    }

        public static void search(String name, ArrayList<Person> people) {
            for (Person i : people) {
                if (i.name == name){
                    System.out.println("YOU FOUND THEM!");
                }
            }
    }

    }




