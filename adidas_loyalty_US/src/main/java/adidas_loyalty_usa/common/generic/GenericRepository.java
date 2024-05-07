package adidas_loyalty_usa.common.generic;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T, String> extends MongoRepository<T, String> {

}
