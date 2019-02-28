public class InternationalDivision extends Division{

    private String country;
    private String language;

    public InternationalDivision(String division, String account,String country, String language){
        super(division, account);
        this.country=country;
        this.language=language;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    @Override
    public String display() {
        return "Division: "+this.getDivision()+"\nAccount: "+this.getAccount()+"\nCountry: "+this.getCountry()+"\nLanguage: "+this.getLanguage();
    }

}