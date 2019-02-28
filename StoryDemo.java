import java.util.ArrayList;

public class StoryDemo {

    public static void main(String[] args) {

        Story s1=new Novel("Crítica de la Razón Pura", "Manuel Kant");
        Story s2=new Novella("El Gato Negro", "Edgar Alan Poe");
        Story s3=new ShortStory("Horton", "Dr Zeus");
        Story s4=new Novel("Algebra de Baldor", "Pues Baldor no mames");
        Story s5=new Novella("El Arte de la Guerra", "Sun Tzu");
        Story s6=new ShortStory("Estudio en Escarlata", "Sir Arthur Conan Doyle");

        s1.setPages(300);
        s2.setPages(70);
        s3.setPages(20);
        s4.setPages(90);
        s5.setPages(150);
        s6.setPages(60);

        ArrayList<Story> historias= new ArrayList<Story>();

        historias.add(s1);
        historias.add(s2);
        historias.add(s3);
        historias.add(s4);
        historias.add(s5);
        historias.add(s6);

        for(Story s:historias){
            System.out.println(s.toString());
        }



    }

}