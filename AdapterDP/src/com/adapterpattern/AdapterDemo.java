package com.adapterpattern;

public class AdapterDemo {

    public static void main(String[] args) {

        AndroidCharger androidCharger = new AndroidCharger();
        Android android = new Pixel5();
        androidCharger.charge(android);

        IPhoneCharger iPhoneCharger = new IPhoneCharger();
        IPhone iPhone = new IPhone12Pro();
        iPhoneCharger.charge(iPhone);

        //As we are implementing this class using iPhone Interface, we can also create object as follows
        //IPhone adapter = new AndroidToiPhoneAdapter(android);

        AndroidToiPhoneAdapter adapter = new AndroidToiPhoneAdapter(android);
        iPhoneCharger.charge(adapter);

    }

}
