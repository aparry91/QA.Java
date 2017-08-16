import java.io.IOException;

public class Main {

    public static void main (String [] args) throws IOException {
        Library l = new Library();

        Book b1 = new Book("J K Rowling", "Harry Potter", "Book", true, "Fiction");
        Book b2 = new Book("J R R Tolkein", "Lord of the Rings", "Book", true, "Fiction");
        Book b3 = new Book("Ernest Cline", "Ready Player One", "Book", false, "Fiction");
        Magazine m1 = new Magazine("Shaun Fyles", "Film & Photography", "Magazine", false, "09/08/2014");
        Magazine m2 = new Magazine("Jon Blenky", "Synthetic Worlds", "Magazine", false, "02/03/1995");
        Magazine m3 = new Magazine("Dan Evans", "Football Weekly", "Magazine", true, "05/08/2017");
        Journal j1 = new Journal("Vesselin Paunov", "Microencapsulation of water-in-water emulsions", "Journal", true, "07/08/2014");
        Journal j2 = new Journal("Anupam Das", "Lab on a chip", "Journal", true, "03/05/2012");
        Journal j3 = new Journal("Matthew Hall", "Vehicles of War", "Journal", false, "01/03/1962");

        Staff s1 = new Staff("Adam", "Parry", true);
        Staff s2 = new Staff("Jordan", "Grindrod", true);
        Staff s3 = new Staff("Elliot", "Womack", true);

        Customer c1 = new Customer("John", "Wilcock", true);
        Customer c2 = new Customer("Wilbur", "Smith", true);
        Customer c3 = new Customer("Chris", "Stacey", true);

        l.addItem(b1);
        l.addItem(b2);
        l.addItem(b3);
        l.addItem(m1);
        l.addItem(m2);
        l.addItem(m3);
        l.addItem(j1);
        l.addItem(j2);
        l.addItem(j3);

        l.outputLibrary();

        l.removeItem("Film & Photography");
        l.removeItem("Synthetic Worlds");
        l.removeItem("Football Weekly");
        l.removeItem(7);
        l.removeItem(8);
        l.removeItem(9);

        l.outputLibrary();

        l.checkinById(1);
        l.checkinById(2);
        l.checkoutById(3);

        l.outputLibrary();

        l.Writer(l.bookList);
        l.Reader(l.bookList);

        l.ammendById(3, "J R R Tolkein", "The Hobbit", "Book");

        l.outputLibrary();

        c1.addCustomer(c1);
        c2.addCustomer(c2);
        c3.addCustomer(c3);

        c1.outputCustomerList(56921);

        c1.registerPassword(56921,"Dog423");
        c2.registerPassword(56922,"jojo1");

        c1.login(56921, "Dog321");
        c1.login(56931, "Dog321");
        c1.login(56931, "Dog423");
        c1.login(56921, "Dog423");

        c1.outputCustomerList(56921);

        c1.searchCustomer("John");
        c2.searchCustomer("Wilbur");
        c3.searchCustomer("Chris");

        c1.removeCustomer(56922,"Dog423");
        c2.removeCustomer(56921,"Dog423");
        c1.removeCustomer(56921,"Dog421");
        c1.removeCustomer(56921,"Dog423");

        c1.outputCustomerList(56921);
        c2.outputCustomerList(56922);
        c3.outputCustomerList(56923);

        c2.ammendLogin(56922, "jojo1", "Adam", "Zarry");
        c2.outputCustomerList(56922);

    }


}
