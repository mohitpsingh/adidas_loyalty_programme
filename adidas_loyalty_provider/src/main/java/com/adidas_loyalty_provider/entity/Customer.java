package com.adidas_loyalty_provider.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "customer")
public class Customer extends Base{
    @Id
    private String userId;
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
    private String totalPurchaseAmount;

    public Customer(String userId, String firstName, String lastName, Date dateOBirth, String email, String phoneNumber,
                    String zone, PermanentAddress permanentAddress, CurrentAddress currentAddress, List<Order> orders, String totalPurchaseAmount) {
        this.userId = userId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public void setTotalPurchaseAmount(String totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }
}
