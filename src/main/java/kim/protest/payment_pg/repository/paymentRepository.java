package kim.protest.payment_pg.repository;

import kim.protest.payment_pg.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface paymentRepository extends JpaRepository<Sales, Long>, QuerydslPredicateExecutor<Sales> {

}
