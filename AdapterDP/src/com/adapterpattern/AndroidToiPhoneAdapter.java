package com.adapterpattern;

public class AndroidToiPhoneAdapter implements IPhone{

    Android android;

    public AndroidToiPhoneAdapter(Android theAndroid){
        this.android = theAndroid;
    }

    @Override
    public void charge() {
        android.charge();
    }

}
