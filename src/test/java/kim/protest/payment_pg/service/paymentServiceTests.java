package kim.protest.payment_pg.service;

import kim.protest.payment_pg.dto.SalesDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class paymentServiceTests {
    @Autowired
    private SalesService service;
    
    @Test
    public void testPayDB(){
        SalesDTO dto = SalesDTO.builder()
                .amount(100L)
                .buyer("김영호_테스트")
                .item_name("베가아이언_테스트")
                .merchant_uid("구매번호 테스트")
                .build();

        System.out.println(service.register(dto));
    }
}
