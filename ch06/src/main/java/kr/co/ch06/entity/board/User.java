package kr.co.ch06.entity.board;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TBL_USER")
public class User {

    @Id
    private String userid;
    private String name;
    private int age;


}
