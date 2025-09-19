package kr.co.ch04.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User1DTO {

    private String uid;
    private String name;
    private String birth;
    private int age;


}
