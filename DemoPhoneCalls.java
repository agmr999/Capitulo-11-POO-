public class DemoPhoneCalls {

    public static void main(String[] args) {
        PhoneCall p1=new IncomingCall("9511576592");
        PhoneCall p2=new OutgoingCall("9512378504", 200);

        System.out.println(p1.getInformation());
        System.out.println(p2.getInformation());
    }

}