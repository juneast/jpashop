package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)//타입을 숫자로 하게 되면 중간에 값이 추가되면 값이 변경되는 사태가 발생하기 때문에 STRING으로 만드는게 좋음
    private DeliveryStatus status;

}
