public abstract class PhoneCall {

    protected String number;
    protected Double price;

    public PhoneCall(String number){
        this.number=number;
        this.price=0.0;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract String getNumber();
    public abstract Double getPrice();
    public abstract String getInformation();

}