package org.springProject.ContactSupport;

public class Phone{
    private String countryCode;
    private String userNumber;

    public String getCountryCode(String s) {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getUserNumber(String s) {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return countryCode + "-" + userNumber ;
    }
}
