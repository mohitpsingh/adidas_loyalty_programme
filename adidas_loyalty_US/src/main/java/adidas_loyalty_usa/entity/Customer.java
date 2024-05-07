package adidas_loyalty_usa.entity;

import adidas_loyalty_usa.utils.Tier;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "customer")
public class Customer extends Base{
    @Id
    private String customerId;
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateOBirth;
    private String email;
    private String phoneNumber;
    private String zone;
    private PermanentAddress permanentAddress;
    private CurrentAddress currentAddress;
    private List<Order> orders;
    private Tier tier;
    private String totalPurchaseAmount;

    public Customer(String customerId, String firstName, String lastName, Date dateOBirth, String email, String phoneNumber,
                    String zone, PermanentAddress permanentAddress, CurrentAddress currentAddress, List<Order> orders, String totalPurchaseAmount) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOBirth = dateOBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zone = zone;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
        this.orders = orders;
        this.totalPurchaseAmount = totalPurchaseAmount;
    }

    public Customer() {}

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOBirth() {
        return dateOBirth;
    }

    public void setDateOBirth(Date dateOBirth) {
        this.dateOBirth = dateOBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public PermanentAddress getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(PermanentAddress permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public CurrentAddress getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(CurrentAddress currentAddress) {
        this.currentAddress = currentAddress;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public String getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public void setTotalPurchaseAmount(String totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }
}
