package kr.co.ch09.entity;
import jakarta.persistence.*;
import kr.co.ch09.dto.ProductDTO;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pno;
    private String productName;
    private String category;
    private Integer cate2;
    private int price;
    private int point;
    private int discount;
    private int delivery;
    private int stock;
    private String thumb120;
    private String thumb240;
    private String thumb750;
    private String etc;

    public ProductDTO toDTO(){
        return ProductDTO.builder()
                .pno(pno)
                .productName(productName == null ? "" : productName)
                .category(category == null ? "" : category)
                .cate2(cate2)
                .price(price)
                .point(point)
                .discount(discount)
                .delivery(delivery)
                .stock(stock)
                .thumb120(thumb120 == null ? "" : thumb120)
                .thumb240(thumb240 == null ? "" : thumb240)
                .thumb750(thumb750 == null ? "" : thumb750)
                .etc(etc == null ? "" : etc)
                .build();
    }



}