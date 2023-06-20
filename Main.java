import java.util.*;
import java.util.Scanner;

public class Main {
public static void main(String[] args){

Bookstore store = new Bookstore();
Scanner sc = new Scanner(System.in);
while(store.inventoryValue()>0){
        System.out.println("Please select from the following menu of options, by typing a number:");
        System.out.println("\t 1. Make a Purchase");
        System.out.println("\t 2. Become a Member");
        System.out.println("\t 3. Check the inventory ");
        System.out.println("\t 4.Fill Out a Survey to Receive a Discount Code");
        System.out.println("\t 5. Restock the Inventory"); 
        System.out.println("\t 6. Inventory Value");
        System.out.println("\t 7. Compare the Prices");
        System.out.println("\t 8. Exit");
        

  int num = sc.nextInt();
    switch (num) {
        case 1:
            //Your Bookstore Constructor will add products to the ArrayList for the user to choose from.
            
            System.out.println("Choose a product to purchase from the catalog.");
             // displays the products with the prices - works as a catalog
                store.Catalog();
                int purchase = sc.nextInt();
                //removes a book order
                if(purchase == 1 || purchase == 2 || purchase == 3 ){
                    System.out.println("Enter the ID on the catalog,please.");
                    int id = sc.nextInt();
                    store.removeBook();
                    System.out.println("Enter the price on the catalog,please.");
                    int price = sc.nextInt();
                    System.out.println("How many do you want?");
                    int numOfBooks = sc.nextInt();
                   /* Book b = new Book();
                    b.setNumOfBooks(numOfBooks);*/
                    double cost = price*numOfBooks;
                    

                    System.out.println("Do you have a discount code?");
                    char code = sc.next().charAt(0);
                    if (code== 'y' || code == 'Y' ){
                        System.out.println("Enter your discount code.");
                        int dc = sc.nextInt();
                        cost = price - (price * .1);
                        System.out.println("Thank you. Your total  is $" + cost + ".");
                        System.out.println();
                    }
                    System.out.println("Thank you. Your total  is $" + cost + ".");
                    System.out.println();
                }

                //removes a cd order
                if(purchase == 4 || purchase == 5 || purchase == 6 ){
                    System.out.println("Enter the ID on the catalog,please.");
                    int id = sc.nextInt();
                    store.removeCD();
                     System.out.println("Enter the price on the catalog,please.");
                    int price = sc.nextInt();
                    System.out.println("How many CDs do you want?");
                    int numOfCDs = sc.nextInt();
                    double cost = price * numOfCDs;
                    System.out.println("Do you have a discount code?");
                    char code = sc.next().charAt(0);
                    if (code == 'y' || code == 'Y' ){
                        System.out.println("Enter your discount code.");
                        int dc = sc.nextInt();
                        cost = price - (price * .1);
                        System.out.println("Thank you. Your total  is $" + cost + ".");
                        System.out.println();
                    }
                    System.out.println("Thank you. Your total is $" + cost );
                    System.out.println();
                }

                //removes a DVD order
                 if(purchase == 7 || purchase == 8 || purchase == 9 ){
                    System.out.println("Enter the ID  on the catalog,please.");
                    int id = sc.nextInt();
                    System.out.println("Enter the price on the catalog,please.");
                    int price = sc.nextInt();                    
                    System.out.println("How many DVDs do you want?");
                    int numOfDVDs = sc.nextInt();
                    double cost = price * numOfDVDs;
                    store.removeDVD();
                     System.out.println("Do you have a discount code?");
                    char code = sc.next().charAt(0);
                    if (code == 'y' || code == 'Y' ){
                        System.out.println("Enter your discount code.");
                        int dc = sc.nextInt();
                        cost = price - (price * .1);
                        System.out.println("Thank you. Your total  is $" + cost + ".");
                        System.out.println();

                    }
                    System.out.println("Thank you. Your total is  $" + cost );
                    System.out.println();
                }
         break;
         
        case 2:
        PremiumMembership pm = new PremiumMembership();
        RegularMembership rm = new RegularMembership();

           store.printPremiumMembers(); // prints the current premium  members
           store.printRegularMembers();// prints the current regular members

                System.out.println("If you see your name as a premium member, please enter 'p'; if you see your name as a regular member, please enter 'r'. Want to be  a member? Please enter any other letter.");
                char letter = sc.next().charAt(0);
                if(letter == 'p' || letter == 'P'){
                    System.out.println("You are a Premium Member!!");
                    pm.setPremiumMember(true);
                }

                if(letter == 'r' || letter == 'R'){
                    System.out.println("You are a Regular Member!!");
                    rm.setRegularMember(true);
                }
                if(letter != 'p' && letter != 'P' && letter != 'r' && letter != 'R'){
                pm.setPremiumMember(false);
                rm.setRegularMember(false);
                System.out.println("Please enter r if you want to be a regular member  or  p if you want to become a premium member. Premium Membership will cost you $2 while regular is free.");
                }
                 // adds a new member
                char n = sc.next().charAt(0);
                if(n == 'p' || n == 'P'){
                    System.out.println("Enter your name, please.");
                    sc.nextLine();
                    String memberName = sc.nextLine();
                    store.addNewPremiumMember(memberName,true);
                    System.out.println("Congratulations!!! You are a premium member now !!!");
                }
                 if(n == 'r' || n == 'R'){
                    System.out.println("Enter your name, please.");
                    sc.nextLine();
                    String name = sc.nextLine();
                    store.addNewRegularMember(name,true);
                    System.out.println("Congratulations!!! You are a member now !!!");
                }
        break;
         case 3:
            System.out.println("In order to see the inventory you have to be a staff, enter the password.");
            int i = sc.nextInt();
            if(i == 1234){
            store.printInventory(); // displays the inventory
            }

            break;

            case 4: //survey
            System.out.println("Do you want to complete a survey to earn a %10 discount?");
            char s = sc.next().charAt(0);
            if (s == 'y' || s == 'y'){
                System.out.println("How would you rate your experience out of 10? ");
                int u = sc.nextInt();
                System.out.println("How would you rate our service out of 10? ");
                int r = sc.nextInt();
                System.out.println("How would you rate our item selection out of 10?");
                int v = sc.nextInt(); 
                System.out.println("You earned a discount code!!");
                store.DiscountCode();
            }
            else{
            System.exit(0);
            } 
            break;

            case 5:

            System.out.println("How much do you want to restock products? This will restock each product." );
            store.totalInventory();
            int k = sc.nextInt(); 
            store.restockProduct(0,k);

            break;
            case 6 : 
            
            store.inventoryValue();
    
            break;
            case 7 :
            ArrayList<Product> al=new ArrayList<Product>();  
            al.add(new Book("The Lord of The Rings",12,10,0));  
            al.add(new Book("Maze Runner",13,10,1));  
            al.add(new Book("Percy Jackson and the Olympians",13,10,2));  
            al.add(new CD("Love Yourself: Her",20,10, 3));  
            al.add(new CD("Map of The Soul 7",25,10,4));  
            al.add(new CD("Oddinary",25,10, 5));  
            al.add(new CD("The Minions",8,10,6));  
            al.add(new CD("Frozen",10,10,7));  
            al.add(new CD("Lorax",5,10,8));
            Collections.sort(al);  
            System.out.println("From Most to Least Expensive");
            for(Product st:al){  
            System.out.println("Name: "+ st.getName() +" "+ "$" +st.getPrice() + " ID:" +st.getId());  
            }  
        
            break;
            case 8: 
            System.exit(0);
    }  
    
    }
}
}
