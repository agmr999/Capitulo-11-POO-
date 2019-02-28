public abstract class Division {

    protected String division;
    protected String account;

    public Division(String division, String account){
        this.division=division;
        this.account=account;
    }
    
    public abstract String display();

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @return the division
     */
    public String getDivision() {
        return division;
    }

}