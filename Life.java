package Capitulo11;

public class Life extends Insurance {


    public Life() {
        super("health insurance");
    }


    @Override
    public void setCost() {
        this.monthlyPrice = 36.00;
    }

    @Override
    public String display() {
        return "su seguro de vida es: "+this.getTypeInsurence()+
                "\n el costo por mes es: "+this.getMonthlyPrice();

    }
}
