public class UseBook {

    public static void main(String[] args) {

        Book l1=new Fiction("Lord of the Rings");
        Book l2=new NonFiction("Historia de México");

        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }

}