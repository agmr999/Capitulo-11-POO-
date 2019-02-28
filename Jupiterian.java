
public class Jupiterian extends Alien{
    
    public Jupiterian(int ojos, String planeta, int edad){
        super(ojos,planeta,edad);
    }

    public String toString() {
        return "Es un Jupitarian, su edad es: "+getEdad()+"\nSu planeta es: "+getPlaneta()+"\nTiene "+getOjos()+" ojos";
    }

}