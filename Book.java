public abstract class Book {

    protected String name;
    protected Double price;

    public Book(String name){
        this.name=name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    public abstract void setPrice();

    public String toString(){
        return "Nombre: "+this.getName()+"\n"+"Precio: "+this.getPrice();
    }

}