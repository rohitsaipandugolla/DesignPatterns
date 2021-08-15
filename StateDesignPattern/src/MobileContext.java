public class MobileContext {
    private MobileState mobileState;

    public  MobileContext(){
        mobileState = null;
    }

    public void setState(MobileState mobileState){
        this.mobileState = mobileState;
    }

    public void alert(){
        mobileState.alert();
    }
}
