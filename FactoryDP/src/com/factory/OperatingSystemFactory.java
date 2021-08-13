package com.factory;

import com.phone.Android;
import com.phone.IOS;
import com.phone.OperatingSystem;
import com.phone.Windows;

public class OperatingSystemFactory {

    public OperatingSystem getInstance(String str) {

        if (str.equalsIgnoreCase("Android"))
            return new Android();

        else if (str.equalsIgnoreCase("iPhone"))
            return new IOS();

        return new Windows();

    }

}
