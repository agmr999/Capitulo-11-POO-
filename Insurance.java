package Capitulo11;

public abstract class Insurance {

protected String TypeInsurence;
protected Double monthlyPrice;

    public Insurance(String typeInsurence) {
        TypeInsurence = typeInsurence;
    }

    public String getTypeInsurence() {
        return TypeInsurence;
    }

    public Double getMonthlyPrice() {
        return monthlyPrice;
    }


    public abstract void setCost();
    public abstract String display();
}
