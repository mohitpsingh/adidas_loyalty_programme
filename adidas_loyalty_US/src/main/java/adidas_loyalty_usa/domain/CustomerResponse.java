package adidas_loyalty_usa.domain;

import java.util.List;

public class CustomerResponse {
    private int status;
    private List<CustomerDto> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<CustomerDto> getData() {
        return data;
    }

    public void setData(List<CustomerDto> data) {
        this.data = data;
    }
}
