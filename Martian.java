public class Martian extends Alien{
    
    public Martian(int ojos, String planeta, int edad){
        super(ojos,planeta,edad);
    }

    public String toString() {
        return "Es un Martian, su edad es: "+getEdad()+"\nSu planeta es: "+getPlaneta()+"\nTiene "+getOjos()+" ojos";
    }

}