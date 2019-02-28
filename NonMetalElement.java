public class NonMetalElement extends Elements{

    public NonMetalElement(String symbol, Integer number, Double weight){
        super(symbol, number, weight);
    }

    @Override
    public String describeElement() {
        return this.getSymbol()+"\nAtomic number: "+this.getNumber()+"\nAtomic weight: "+this.getWeight()+"\nPoor conductor";
    }

}