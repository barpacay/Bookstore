import java.util.*;
import java.util.Scanner;

public class Bookstore implements BookStoreSpecification {
    
    private  ArrayList<Product> bookstore = new ArrayList();
    private  ArrayList<PremiumMembership> premiumMemberList  = new ArrayList();
    private  ArrayList<RegularMembership> regularMemberList  = new ArrayList();
    

  public Bookstore (){
      // actual bookstore
    bookstore.add(new Book("The Lord of The Rings",12,10,0));
    bookstore.add(new Book("Maze Runner",13,10,1));
    bookstore.add(new Book("Percy Jackson and the Olympians",13,10,2));
    
    bookstore.add(new CD("Love Yourself: Her",20,10,0));
    bookstore.add(new CD("Map of The Soul 7",25,10,1));
    bookstore.add(new CD("Oddinary",25,10,2));

    bookstore.add(new DVD("The Minions",8,10,0));
    bookstore.add(new DVD("Frozen",10,10,1));
    bookstore.add(new DVD("Lorax",5,10,2));

    premiumMemberList.add(new PremiumMembership("Mark Lee" , true));
    premiumMemberList.add(new PremiumMembership("Christopher Bahng" , true));
    premiumMemberList.add(new PremiumMembership("Jay Park" , true));
    regularMemberList.add(new RegularMembership("Johhny Suh" , true));
    regularMemberList.add(new RegularMembership("Vernon Chwe" , true));
    regularMemberList.add(new RegularMembership("Jake Sim" , true));
    }


@Override
 public void removeBook() { //removes book
   for (Product b : bookstore) {
       if(b instanceof Book){
            //bookstore.remove(id);
            ((Book)b).decrementBook();

       }
    }
  }

@Override
public void removeCD(){ //removes cd
    for (Product c : bookstore) {
       if(c instanceof CD){
        ((CD)c).decrementCD();
       }
    }
  }

@Override
public void removeDVD(){ //removes dvd
    for (Product dvd : bookstore) {
       if(dvd instanceof DVD){
        ((DVD)dvd).decrementDVD();
       }
    }
}


@Override
public  void addNewPremiumMember(String memberName, boolean premiumMember){ // adds new premium member
        premiumMemberList.add(new PremiumMembership (memberName, premiumMember));
    }

 @Override   
public void printPremiumMembers(){ // prints premium members
        for (PremiumMembership m: premiumMemberList){
            System.out.println("Current Premium Members: " + m.getMemberName() );
        }  
    }

@Override
public  void addNewRegularMember(String name, boolean regularMember){ //adds new regular member
        regularMemberList.add(new RegularMembership (name, regularMember));
    }
    
@Override    
public void printRegularMembers(){ //prints regular members 
        for (RegularMembership r: regularMemberList){
            System.out.println("Current Regular Members: " + r.getName() );
        }  
    }
    
@Override
public void printInventory(){ //prints the inventory
        for (Product  bk :  bookstore){
            if(bk instanceof Book){
            System.out.println("Number Of " + ((Book)bk).getName() + " : " + ((Book)bk).getBookStock());
            }
        }  
        for (Product cd : bookstore){
             if(cd instanceof CD){
            System.out.println("Number Of " + ((CD)cd).getName() + " : " + ((CD)cd).getCdStock() );
             }
         }
 
        for (Product dvd : bookstore){
            if(dvd instanceof DVD){
            System.out.println("Number Of " + ((DVD)dvd).getName() + " : " + ((DVD)dvd).getDvdStock() );
            }
        } 
        
    }

    public void Catalog(){ //prints the catalog
                System.out.println("1.Lord of The Rings ----- $12 (0)(Book) ");
                System.out.println("2.Percy Jackson and the Olympians ----- $10 (1) (Book)");
                System.out.println("3.Maze Runner ----- $13  (2)(Book)");
                System.out.println("4.Love Yourself: Her  ----- $20 (0)(CD)");
                System.out.println("5.Map of the Soul 7 ----- $25 (1)(CD)");
                System.out.println("6.Oddinary ----- $25 (2)(CD)");
                System.out.println("7.The Minions ----- $8 (0)(DVD)");
                System.out.println("8.Frozen  ----- $10 (1) (DVD)");
                System.out.println("9.Lorax ----- $5 (2) (DVD)");
    }

@Override
    public void DiscountCode(){
        Random random = new Random();
        int number = random.nextInt(1001);
        System.out.println("Discount Code:" + number);
    }

public void totalInventory(){
        int s = 0; 
        for(Product b : bookstore){
            if(b instanceof Book ){
                s +=((Book)b).getBookStock() ;
            }
        }
        int s1 = 0;
        for(Product cd : bookstore){
            if(cd instanceof CD ){
                s1 += ((CD)cd).getCdStock();
            }
        }
        int  s2 = 0;
        for(Product dvd : bookstore){
            if(dvd instanceof DVD ){
                s2 += ((DVD)dvd).getDvdStock()  ;
            }
        }
        int totalInventory = s+s1+s2;
        System.out.println("Total Inventory  for All of The Products Before Restocking :" + totalInventory);

}

 @Override   
    public void restockProduct(int totalStock, int amount){
        int sm = 0; 
        for(Product b : bookstore){
            if(b instanceof Book ){
                int bookRestock=((Book)b).getBookStock() + amount;
                ((Book)b).setBookStock(bookRestock);
                sm+= bookRestock;
            }
        }
        int sm1 = 0;
        for(Product cd : bookstore){
            if(cd instanceof CD ){
                int cdRestock = ((CD)cd).getCdStock() + amount;
                ((CD)cd).setCdStock(cdRestock);
                sm1+= cdRestock;
            }
        }
        int  sm2 = 0;
        for(Product dvd : bookstore){
            if(dvd instanceof DVD ){
                int  dvdRestock = ((DVD)dvd).getDvdStock() + amount ;
                ((DVD)dvd).setDvdStock(dvdRestock); 
                sm2+=dvdRestock;
            }
        }

        totalStock = sm+sm1+sm2;
        System.out.println("Your restocking was successful!!");
        System.out.println("Total Inventory  for All of The Products:" + totalStock);
    
    }

    @Override
    public double inventoryValue(){
        double sum = 0.0;
        for(Product b : bookstore){
            if(b instanceof Book ){
                double bookInventoryValue = ((Book)b).getBookStock() * ((Book)b).getPrice();
                sum+=bookInventoryValue;
            }
        }
        double sum1 = 0.0;
        for(Product cd : bookstore){
            if(cd instanceof CD ){
                double cdInventoryValue = ((CD)cd).getCdStock() * ((CD)cd).getPrice();
                sum1+=cdInventoryValue;
            }
        }
        double sum2 = 0.0;
        for(Product dvd : bookstore){
            if(dvd instanceof DVD ){
                double dvdInventoryValue = ((DVD)dvd).getDvdStock() * ((DVD)dvd).getPrice();
                sum2+=dvdInventoryValue;
            }
        
        }

        double totalInventoryValue = sum +sum1+sum2;
        System.out.println("Total Inventory Value for All of The Products: $" + totalInventoryValue);
        return totalInventoryValue; 
    }
    
    
}

