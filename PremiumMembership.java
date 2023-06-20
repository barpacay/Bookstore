public class PremiumMembership{
    private String memberName;
    private boolean premiumMember;
    private int moneySpent ;
    

    public PremiumMembership(){
    }
    
    public PremiumMembership(String memberName, boolean premiumMember ){
        this.memberName = memberName;
        this.premiumMember = premiumMember;
        this.moneySpent = 0;
        
    }
    
    public String getMemberName(){
        return this.memberName;
    }
    
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }
    
    
    public boolean getPremiumMember(){
        return premiumMember;
    }
    public void setPremiumMember(boolean premiumMember){
        this.premiumMember = premiumMember; 
    }

     public int getMoneySpent(){
        return moneySpent;
    }
    public void setMoneySpent(int moneySpent){
        this.moneySpent = moneySpent;
    }
}
