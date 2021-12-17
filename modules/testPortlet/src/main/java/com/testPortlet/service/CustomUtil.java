package com.testPortlet.service;

import org.osgi.service.component.annotations.Component;

import java.util.Arrays;

@Component(service = CustomUtil.class)
public class CustomUtil {

    public String stringArrayIntoString(String[] stringArray){
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < stringArray.length; i++) {
            stringBuffer.append(stringArray[i]);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public String[] StringIntoStringArray(String string){
        return string.split("[\n]");
    }

}
