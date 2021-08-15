public class Main {
    public static void main(String[] args) {

        MobileContext mobileContext = new MobileContext();

        mobileContext.setState(new Ringing());
        mobileContext.alert();

        System.out.println("-----------------");

        mobileContext.setState(new Vibration());
        mobileContext.alert();

        System.out.println("-----------------");

        mobileContext.setState(new Silent());
        mobileContext.alert();
    }
}
