public class IncomingCall extends PhoneCall{

    public IncomingCall(String number){
        super(number);
        this.price=0.02;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getInformation() {
        return "Number: "+this.getNumber()+"\nRate: "+this.getPrice()+"\nPrice: "+this.getPrice();
    }

}