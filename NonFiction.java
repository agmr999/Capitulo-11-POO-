public class NonFiction extends Book{

    public NonFiction(String name){
        super(name);
        setPrice();
    }

    @Override
    public void setPrice() {
        this.price=37.99;
    }
    
}