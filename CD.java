public class CD extends Product {
      
    private int numOfCDs;
    private int cdStock; ;

    public CD( String name,int price,int cdStock,int id ){
        super(name , price, id);
        this.cdStock = cdStock;
    }
    
    public int getNumOfCDs(){
        return this.numOfCDs;
    }
    public void setNumOfCDs(int numOfCDs2 ){
        if (numOfCDs2<0){
           System.out.println("ERROR!! Invalid input. Try a number bigger than 0.");
        }
         else {
            numOfCDs = numOfCDs2;
        }
    }

    public int getCdStock(){
        return cdStock;
    }
    
    public void setCdStock(int cdStock ){
        this.cdStock = cdStock;
    }

    public int decrementCD(){
    cdStock = cdStock - getNumOfCDs();
    return cdStock;      
    }

    public String toString(){
        return "The details of the CD are: " +super.toString()+" "+numOfCDs ;
    } 
     
    
}