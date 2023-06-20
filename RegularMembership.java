public class RegularMembership{
    private String name;
    private boolean regularMember;
    private int moneySpent;

    public RegularMembership(){
    }
    
    public RegularMembership(String name, boolean regularMember){
        this.name = name;
        this.regularMember = regularMember;
        this.moneySpent = 0; 
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
    public boolean getRegularMember(){
        return regularMember;
    }
    public void setRegularMember(boolean regularMember){
        this.regularMember = regularMember; 
    }
    

    public int getMoneySpent(){
        return moneySpent;
    }
    public void setMoneySpent(int moneySpent){
        this.moneySpent = moneySpent;
    }
}
