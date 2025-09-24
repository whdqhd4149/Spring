package kr.co.ch08.dto;


import jakarta.validation.constraints.*;
import kr.co.ch08.entity.User2;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User2DTO {


    private String userid;

    private String name;

    private String age;

    private String address;


    public User2 toEntity() {
        return User2.builder()
                .userid(userid)
                .name(name)
                .age(age)
                .address(address)
                .build();
    }
}
