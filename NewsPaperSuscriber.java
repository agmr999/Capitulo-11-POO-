public abstract class NewsPaperSuscriber {

    protected String street;
    protected Double rate;

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the rate
     */
    public Double getRate() {
        return rate;
    }

    public abstract void setRate();

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof NewsPaperSuscriber){
            NewsPaperSuscriber tmp= (NewsPaperSuscriber)obj;
            return this.getStreet()==tmp.getStreet();
        }else{
            return false;
        }
    }

    public NewsPaperSuscriber newObject(String type){
        if(type=="SevenDay"){
            return new SevenDaySuscriber();
        }else if(type=="Week"){
            return new WeekDaySuscribers();
        }else{
            return new WeekendSuscribers();
        
    }

}
