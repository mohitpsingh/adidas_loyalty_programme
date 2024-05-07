package com.adidas_loyalty_provider.entity;

public class CurrentAddress {
    private String current_StreetAddress;
    private String current_City;
    private String current_State;
    private String current_PostalCode;
    private String current_Country;

    public CurrentAddress() {

    }

    public String getCurrent_StreetAddress() {
        return current_StreetAddress;
    }

    public void setCurrent_StreetAddress(String current_StreetAddress) {
        this.current_StreetAddress = current_StreetAddress;
    }

    public String getCurrent_City() {
        return current_City;
    }

    public void setCurrent_City(String current_City) {
        this.current_City = current_City;
    }

    public String getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(String current_State) {
        this.current_State = current_State;
    }

    public String getCurrent_PostalCode() {
        return current_PostalCode;
    }

    public void setCurrent_PostalCode(String current_PostalCode) {
        this.current_PostalCode = current_PostalCode;
    }

    public String getCurrent_Country() {
        return current_Country;
    }

    public void setCurrent_Country(String current_Country) {
        this.current_Country = current_Country;
    }
}
