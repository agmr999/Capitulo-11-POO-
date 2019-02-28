public abstract class Auto {

    protected String make;
    protected Double price;

    /**
     * @param model the model to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    public abstract void setPrice();

}