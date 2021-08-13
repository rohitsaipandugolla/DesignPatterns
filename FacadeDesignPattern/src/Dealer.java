public class Dealer {

    private final GadgetStore mobile;
    private final GadgetStore headSet;
    private final GadgetStore smartWatch;

    public Dealer() {

        mobile = new Mobile();

        headSet = new HeadSet();

        smartWatch = new SmartWatch();

    }

    public void mobileSale() {
        mobile.modelName();
        mobile.price();
    }

    public void headSetSale() {
        headSet.modelName();
        headSet.price();
    }

    public void smartWatchSale() {
        smartWatch.modelName();
        smartWatch.price();
    }

}
