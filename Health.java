package Capitulo11;

public class Health extends Insurance {

    public Health() {
        super("life insurance");
    }


    @Override
    public void setCost() {
        this.monthlyPrice = 196.00;
    }

    @Override
    public String display() {
        return "su seguro de vida es: "+this.getTypeInsurence()+
                "\n el costo por mes es: "+this.getMonthlyPrice();

    }
}
