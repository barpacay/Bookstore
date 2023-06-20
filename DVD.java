public class DVD extends Product {
    
    private int  numOfDVDs;
    private int dvdStock;

    
    public DVD(String name, int price ,  int dvdStock , int id){
        super(name , price, id);
        this.dvdStock = dvdStock;
}

   public int getNumOfDVDs(){
        return numOfDVDs;
    }

    public void setNumOfDVDs(int numOfDVDs2 ){
        if (numOfDVDs2<0){
           System.out.println("ERROR!! Invalid input. Try a number bigger than 0.");
       }
         else {
            numOfDVDs = numOfDVDs2;
      }
    }

    public int getDvdStock(){
        return dvdStock;
    }
    
    public void setDvdStock(int dvdStock ){
        this.dvdStock = dvdStock;
    }

    public int decrementDVD( ){
     dvdStock = dvdStock - getNumOfDVDs();
    return dvdStock;      
    }

    public String toString(){
        return "The details of the DVD are: " + super.toString() + " " + numOfDVDs ;
    } 
    
}