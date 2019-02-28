 
 public abstract class Alien{
     protected int ojos;
     protected String planeta;
     protected int edad;

     public Alien(int ojos, String planeta, int edad){
        this.edad=edad;
        this.ojos=ojos;
        this.planeta=planeta;
     }

     /**
      * @return the edad
      */
     public int getEdad() {
         return edad;
     }

     /**
      * @return the ojos
      */
     public int getOjos() {
         return ojos;
     }

     /**
      * @return the planeta
      */
     public String getPlaneta() {
         return planeta;
     }

     /**
      * @param edad the edad to set
      */
     public void setEdad(int edad) {
         this.edad = edad;
     }

     /**
      * @param ojos the ojos to set
      */
     public void setOjos(int ojos) {
         this.ojos = ojos;
     }

     /**
      * @param planeta the planeta to set
      */
     public void setPlaneta(String planeta) {
         this.planeta = planeta;
     }

     @Override
     public String toString() {
         return "Su edad es: "+getEdad()+"\nSu planeta es: "+getPlaneta()+"\nTiene "+getOjos()+" ojos";
     }
 }