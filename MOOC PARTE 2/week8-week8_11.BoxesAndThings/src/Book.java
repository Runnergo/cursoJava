
public class Book implements ToBeStored{
    
    // Atributos de autor, titulo y peso del libro
    private String author;
    private String title;
    private double weightBook;
    
    public Book(String author, String title, double weightBook){
        this.author=author;
        this.title=title;
        this.weightBook=weightBook;
    }
    // Metodo implementado, peso del libro
    @Override
    public double weight(){
        return this.weightBook;
    }
    
     // toString sobrescrito del libro
    @Override
    public String toString(){
        return this.author+": "+this.title;
    }
}
