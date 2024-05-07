package adidas_loyalty_usa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "customer")
public class CustomerDto extends Base{
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateOBirth;
    private String email;
    private String phoneNumber;
    private String zone;
    private PermanentAddressDto permanentAddressDto;
    private CurrentAddressDto currentAddressDto;
    private List<OrderDto> orderDtos;
    private String totalPurchaseAmount;

    public CustomerDto(String userId, String firstName, String lastName, Date dateOBirth, String email, String phoneNumber,
                       String zone, PermanentAddressDto permanentAddressDto, CurrentAddressDto currentAddressDto, List<OrderDto> orderDtos, String totalPurchaseAmount) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOBirth = dateOBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zone = zone;
        this.permanentAddressDto = permanentAddressDto;
        this.currentAddressDto = currentAddressDto;
        this.orderDtos = orderDtos;
        this.totalPurchaseAmount = totalPurchaseAmount;
    }

    public CustomerDto() {}

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

    public PermanentAddressDto getPermanentAddress() {
        return permanentAddressDto;
    }

    public void setPermanentAddress(PermanentAddressDto permanentAddressDto) {
        this.permanentAddressDto = permanentAddressDto;
    }

    public CurrentAddressDto getCurrentAddress() {
        return currentAddressDto;
    }

    public void setCurrentAddress(CurrentAddressDto currentAddressDto) {
        this.currentAddressDto = currentAddressDto;
    }

    public List<OrderDto> getOrders() {
        return orderDtos;
    }

    public void setOrders(List<OrderDto> orderDtos) {
        this.orderDtos = orderDtos;
    }

    public String getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public void setTotalPurchaseAmount(String totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }
}
