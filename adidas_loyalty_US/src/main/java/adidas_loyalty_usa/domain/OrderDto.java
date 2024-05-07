package adidas_loyalty_usa.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "order")
public class OrderDto extends Base{
    @Id
    private String orderId;
    private TransactionDto transactionDto;
    private List<ProductDto> productDtos;

    public OrderDto() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public TransactionDto getTransaction() {
        return transactionDto;
    }

    public void setTransaction(TransactionDto transactionDto) {
        this.transactionDto = transactionDto;
    }

    public List<ProductDto> getProducts() {
        return productDtos;
    }

    public void setProducts(List<ProductDto> productDtos) {
        this.productDtos = productDtos;
    }
}
