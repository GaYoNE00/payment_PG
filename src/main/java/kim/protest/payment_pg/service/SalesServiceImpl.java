package kim.protest.payment_pg.service;

import kim.protest.payment_pg.dto.SalesDTO;
import kim.protest.payment_pg.entity.Sales;
import kim.protest.payment_pg.repository.paymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class SalesServiceImpl implements SalesService{


    private final paymentRepository repository;

    @Override
    public Long register(SalesDTO dto){
        log.info("DTO...........................................");
        log.info(dto);

        Sales entity = dtoToEntity(dto);

        log.info(entity);

        repository.save(entity);

        return entity.getGno();

    }
}
