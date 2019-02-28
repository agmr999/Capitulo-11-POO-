public class OutgoingCall extends PhoneCall{

    private Integer minutes;

    public OutgoingCall(String number,Integer minutes){
        super(number);
        this.minutes=minutes;
        this.price=0.04*minutes;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    /**
     * @return the minutes
     */
    public Integer getMinutes() {
        return minutes;
    }

    @Override
    public String getInformation() {
        return "Number: "+this.getNumber()+"\nRate per minute: 0.04"+"\nMinutes: "+this.getMinutes()+"\nTotal Price: "+this.getPrice();
    }

}