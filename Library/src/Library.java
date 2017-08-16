import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {

        public Library(){
        }

    List<Item> bookList = new ArrayList<>();


    public void addItem(Item i) {
        bookList.add(i);
    }


    public void removeItem(String title) {
        for (Item i : bookList) {
            if (i.getTitle().equals(title)) {
                bookList.remove(i);
                break;
            }

        }
    }

    public void removeItem(int bookId) {
        for (Item i : bookList) {
            if (i.getBookId() == (bookId)) {
                bookList.remove(i);
                break;
            }

        }
    }

    public void outputLibrary() {
        for (Item i : bookList) {
            System.out.println(i);
        }
    }

    public void ammendById(int bookId, String author, String title, String type) {
        for (Item i : bookList) {
            if (i.getBookId() == (bookId)) {
                i.setAuthor(author);
                i.setTitle(title);
                i.setType(type);
            }
        }
    }

    public void checkoutById(int bookId) {
        for (Item i : bookList) {
            if (i.getBookId() == bookId) {
                i.setCheckedOut(true);
            }
        }
    }

    public void checkinById(int bookId) {
        for (Item i : bookList) {
            if (i.getBookId() == bookId) {
                i.setCheckedOut(false);
            }
        }
    }

        public void Writer(List<Item> bookArr) {
            try {
                BufferedWriter fileWrite = new BufferedWriter(new FileWriter("F:/Java Test/bookList.txt"));
                for (Item i : bookArr) {

                    fileWrite.write(i.toString());
                }
                fileWrite.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        public void Reader(List<Item> bookList) throws IOException {

            BufferedReader inFile = new BufferedReader(new FileReader("F:/Java Test/bookList.txt"));

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
