public class DomesticDivision extends Division{

    private String state;

    public DomesticDivision(String division, String account, String state){
        super(division, account);
        this.state=state;
    }

    @Override
    public String getAccount() {
        return super.getAccount();
    }

    @Override
    public String getDivision() {
        return super.getDivision();
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    @Override
    public String display() {
        return "Division: "+this.getDivision()+"\nAccount: "+this.getAccount()+"\nState: "+this.getState();
    }
    
}