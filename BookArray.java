import java.util.ArrayList;

import sun.jvm.hotspot.ui.action.FindAction;

public class BookArray {

    public static void main(String[] args) {

        Book b1=new Fiction("Narnia");
        Book b2=new NonFiction("Estructura de Datos");
        Book b3=new Fiction("Matrix");
        Book b4=new NonFiction("Historia Universal");
        Book b5=new Fiction("The Hobbit");
        Book b6=new NonFiction("Joyce");
        Book b7=new Fiction("Peter Pan");
        Book b8=new NonFiction("Código Penal");
        Book b9=new Fiction("Lord of the Rings");
        Book b0=new NonFiction("Programación Estructurada");

        ArrayList<Book> lista=new ArrayList<Book>();

        lista.add(b0);
        lista.add(b1);
        lista.add(b2);
        lista.add(b3);
        lista.add(b4);
        lista.add(b5);
        lista.add(b6);
        lista.add(b7);
        lista.add(b8);
        lista.add(b9);

        for(Book b:lista){
            System.out.println(b.toString());
        }        
        
    }

}