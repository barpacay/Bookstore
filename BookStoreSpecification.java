public interface BookStoreSpecification{

    public void removeBook();

    public void removeCD( );
    
    public void removeDVD();

    public  void addNewPremiumMember(String memberName, boolean premiumMember);
    public void printPremiumMembers();

    public  void addNewRegularMember(String name, boolean regularMember);
    public void printRegularMembers();

    public void printInventory(); 

    public void Catalog();

    public void DiscountCode();
    
    public  void  restockProduct(int totalStock, int amount); 

    public double inventoryValue();
    
}