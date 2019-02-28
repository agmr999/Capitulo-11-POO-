public class SevenDaySuscriber extends NewsPaperSuscriber{

    public SevenDaySuscriber(){
        setRate();
    }

    @Override
    public void setRate() {
        this.rate=4.50;
    }

    @Override
    public String toString() {
        return "Street: "+this.getStreet()+"\nRate: "+this.getRate()+"\nType: Seven Day";
    }
    
}