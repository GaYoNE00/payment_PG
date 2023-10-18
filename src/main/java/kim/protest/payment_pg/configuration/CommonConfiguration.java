package kim.protest.payment_pg.configuration;

import kim.protest.payment_pg.controller.SampleController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kim.protest.payment_pg.controller")
public class CommonConfiguration {
}
