package com;

import com.factory.OperatingSystemFactory;
import com.phone.Android;
import com.phone.IOS;
import com.phone.OperatingSystem;

public class FactoryMain {
    public static void main(String[] args) {

//        OperatingSystem android = new Android();
//        android.spec();
//
//        OperatingSystem ios = new IOS();
//        ios.spec();

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

        OperatingSystem android = operatingSystemFactory.getInstance("Android");

        android.spec();

        OperatingSystem iOS = operatingSystemFactory.getInstance("iPhone");

        iOS.spec();


    }
}
