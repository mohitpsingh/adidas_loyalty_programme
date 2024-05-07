package adidas_loyalty_usa.domain;

public class PermanentAddressDto {
    private String permanent_StreetAddress;
    private String permanent_City;
    private String permanent_State;
    private String permanent_PostalCode;
    private String permanent_Country;

    public PermanentAddressDto() {
    }

    public String getPermanent_StreetAddress() {
        return permanent_StreetAddress;
    }

    public void setPermanent_StreetAddress(String permanent_StreetAddress) {
        this.permanent_StreetAddress = permanent_StreetAddress;
    }

    public String getPermanent_City() {
        return permanent_City;
    }

    public void setPermanent_City(String permanent_City) {
        this.permanent_City = permanent_City;
    }

    public String getPermanent_State() {
        return permanent_State;
    }

    public void setPermanent_State(String permanent_State) {
        this.permanent_State = permanent_State;
    }

    public String getPermanent_PostalCode() {
        return permanent_PostalCode;
    }

    public void setPermanent_PostalCode(String permanent_PostalCode) {
        this.permanent_PostalCode = permanent_PostalCode;
    }

    public String getPermanent_Country() {
        return permanent_Country;
    }

    public void setPermanent_Country(String permanent_Country) {
        this.permanent_Country = permanent_Country;
    }
}
