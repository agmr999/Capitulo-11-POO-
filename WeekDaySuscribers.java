public class WeekDaySuscribers extends NewsPaperSuscriber{

    public WeekDaySuscribers(){
        setRate();
    }

    @Override
    public void setRate() {
        this.rate=3.50;
    }

    @Override
    public String toString() {
        return "Street: "+this.getStreet()+"\nRate: "+this.getRate()+"\nType: Weekend";
    }
    
}