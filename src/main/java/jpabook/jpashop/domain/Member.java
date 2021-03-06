package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")//order table에 있는 member에 의해 매핑된다.(읽기 전용)
    private List<Order> orders = new ArrayList<>();//필드에서 바로 초기화 하는 것이 null 문제에서 안전

}
