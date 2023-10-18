package kim.protest.payment_pg.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SalesDTO {
    private Long gno;
    private Long amount;
    private String buyer;
    private String item_name;
    private String merchant_uid;
    private LocalDateTime regDate, modDate;
}
