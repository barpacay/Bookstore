public abstract class Product implements Comparable<Product>{

    private String name; 
    private int id; 
    private int price;

    public Product(String name, int price , int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    
    public int getId(){
        return id;
    }
    public String toString(){
        return name + " " + id;
     }

    @Override 

    public int compareTo(Product other)
    {
        if(this.price > other.price){
        return 1;
        }
    
     if(this.price < other.price){
        return -1;
        }
        
    return 0;
    }
    

} 