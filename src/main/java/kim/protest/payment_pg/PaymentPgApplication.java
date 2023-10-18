package kim.protest.payment_pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PaymentPgApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentPgApplication.class, args);
	}

}
