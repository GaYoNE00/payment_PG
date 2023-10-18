package kim.protest.payment_pg.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sales extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gno;

    @Column(length = 100, nullable = false)
    private String item_name;

    @Column(nullable = false)
    private Long amount;

    @Column(length = 100, nullable = false)
    private String buyer;

    @Column(length = 100, nullable = false)
    private String merchant_uid;


}
