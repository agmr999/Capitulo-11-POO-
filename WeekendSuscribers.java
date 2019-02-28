public class WeekendSuscribers extends NewsPaperSuscriber{

    public WeekendSuscribers(){
        setRate();
    }

    @Override
    public void setRate() {
        this.rate=2.0;
    }

    @Override
    public String toString() {
        return "Street: "+this.getStreet()+"\nRate: "+this.getRate()+"\nType: Weekend";
    }
    
}