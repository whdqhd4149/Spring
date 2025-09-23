package kr.co.ch06.entity.shop;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.naming.Name;
import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "SHOP_CUSTOMER")
public class Customer {

    @Id
    @Column(name = "CUSTID")
    private String custId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    @Column(name = "ADDR")
    private String addr;

    @CreationTimestamp
    @Column(name = "REGDATE")
    private LocalDateTime regDate;

    // 추가필드, 테이블 컬럼 속성 제외
    @Transient
    private long orderCount;

}
