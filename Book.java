public class Book extends Product {

    private int numOfBooks;
    private int bookStock;
 
    public Book (String name, int price , int bookStock ,int id) {
        super(name, price,id); 
        this.bookStock = 10;
    }

    public int getNumOfBooks(){
        return numOfBooks;
    }
    
    public void setNumOfBooks(int numOfBooks2 ){
        if (numOfBooks2<0){
         System.out.println("ERROR!! Invalid input. Try a number bigger than 0.");
      }
        else {
         numOfBooks = numOfBooks2;
      }
    }

    public int getBookStock(){
        return bookStock;
    }
    
    public void setBookStock(int bookStock ){
        this.bookStock = bookStock;
    }
    
    public int decrementBook(){
    bookStock = bookStock - getNumOfBooks();
    return bookStock;      
    }

    public String toString(){
        return "The details of the book are: " + super.toString() + " " + numOfBooks ;
    } 

    //public Book(){}
     
}