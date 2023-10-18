package kim.protest.payment_pg.service;

import kim.protest.payment_pg.dto.SalesDTO;
import kim.protest.payment_pg.entity.Sales;

public interface SalesService {
    Long register(SalesDTO dto);

    default Sales dtoToEntity(SalesDTO dto){
        Sales entity = Sales.builder()
                .gno(dto.getGno())
                .merchant_uid(dto.getMerchant_uid())
                .item_name(dto.getItem_name())
                .buyer(dto.getBuyer())
                .amount(dto.getAmount())
                .build();

        return entity;

    }
}
