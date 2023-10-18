package kim.protest.payment_pg.vo;

import lombok.Data;


@Data
public class pay_info {
    private String imp_uid;
    private String merchant_uid;
    private String amount;
    private String buyer;
    private String item_name;
}
