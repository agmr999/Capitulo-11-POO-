public class MetalElement extends Elements{

    public MetalElement(String symbol, Integer number, Double weight){
        super(symbol, number, weight);
    }

    @Override
    public String describeElement() {
        return this.getSymbol()+"\nAtomic number: "+this.getNumber()+"\nAtomic Weight: "+this.getWeight()+"\nGood Conductor";
    }

}