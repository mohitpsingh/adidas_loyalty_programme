package adidas_loyalty_usa.domain;

import adidas_loyalty_usa.entity.Customer;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component("domainConverter")
public class DomainConverter {
    private final ModelMapper modelMapper;

    public DomainConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        modelMapper.addMappings(new PropertyMap<CustomerDto, Customer>() {
            @Override
            protected void configure() {
                map().setCustomerId(source.getUserId());
            }
        });
    }

    public CustomerDto toDto(Customer entity) {
        return modelMapper.map(entity, CustomerDto.class);
    }

    public Customer toEntity(CustomerDto dto) {
        return modelMapper.map(dto, Customer.class);
    }
}
