package org.springProject.ContactSupport;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String s, Locale locale) throws ParseException {
        String[] arr=s.split("-");
       Phone phone=new Phone();

       int index=s.indexOf("-");
       if(index==-1 || s.startsWith("-")){
           phone.setCountryCode("91");
           if(s.startsWith("-")){
               phone.setUserNumber(arr[1]);
           }
           else {
               phone.setUserNumber(arr[0]);
           }
       }
       else{
           phone.setCountryCode(arr[0]);
           phone.setUserNumber(arr[1]);}
       return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        return null;
    }
}
