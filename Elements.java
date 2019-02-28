public abstract class Elements {

    protected String symbol;
    protected Integer number;
    protected Double weight;

    public Elements(String symbol, Integer number, Double weight){
        this.symbol=symbol;
        this.number=number;
        this.weight=weight;
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    public abstract String describeElement();

}