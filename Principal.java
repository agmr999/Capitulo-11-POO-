import com.sun.javafx.print.PrintHelper.PrintAccessor;

public class Principal{
    public static void main(String[] args) {
        Jupiterian A1 = new Jupiterian(10, "Sumasa", 2003);
        Martian A2 = new Martian(3, "Colosus", 14);

        System.out.println(A1.toString());
        System.out.println(A2.toString());
    }    
}