
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Runnergo
 */
public class Library {

    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList();
    }

    public void addBook(Book newBook) {
        library.add(newBook);
    }

    public void printBooks() {
        for (Book list : library) {
            System.out.println(list);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book list : library) {
           if ( StringUtils.included (list.title (), title))  { 
                found.add(list);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book list : library) {
            if (StringUtils.included(list.publisher(), publisher)){
                found.add(list);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book list : library) {
            if (list.year()==year){
                found.add(list);
            }
        }
        return found;
    }

}
