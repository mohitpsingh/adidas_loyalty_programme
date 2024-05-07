package adidas_loyalty_usa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AdidasLoyaltyUsa {
    public static void main(String[] args) {
        SpringApplication.run(AdidasLoyaltyUsa.class, args);
    }
}
