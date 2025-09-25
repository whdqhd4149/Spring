package kr.co.ch09.jwt;

import io.jsonwebtoken.Claims;
import kr.co.ch09.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.Authentication;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JwtProviderTest {

    @Autowired
    private JwtProvider jwtProvider;


    @Test
    void createToken() {

        User user = User.builder()
                .usid("a12345")
                .pass("a12345")
                .name("김춘추")
                .role("ADMIN")
                .age(60)
                .build();

        String token = jwtProvider.createToken(user, -1);
        System.out.println(token);
    }

    @Test
    void getClaims() {

        String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ3aGRxaGQ0MTQ5QGdtYWlsLmNvbSIsImlhdCI6MTc1ODc3MjE3OCwiZXhwIjoxNzU4ODU4NTc4LCJ1c2VybmFtZSI6ImExMjM0NSIsInJvbGUiOiJBRE1JTiJ9.Y4b0JyJK-VwqZWrD-kR8lI0VWNfQp449au5evH1v4A0";

        Claims claims = jwtProvider.getClaims(token);
        System.out.println(claims);
    }

    @Test
    void getAuthentication() {

        String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ3aGRxaGQ0MTQ5QGdtYWlsLmNvbSIsImlhdCI6MTc1ODc3MjE3OCwiZXhwIjoxNzU4ODU4NTc4LCJ1c2VybmFtZSI6ImExMjM0NSIsInJvbGUiOiJBRE1JTiJ9.Y4b0JyJK-VwqZWrD-kR8lI0VWNfQp449au5evH1v4A0";

        Authentication authentication = jwtProvider.getAuthentication(token);
        User user = (User) authentication.getPrincipal();

        System.out.println(user);
    }

    @Test
    void validateToken() {

        String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ3aGRxaGQ0MTQ5QGdtYWlsLmNvbSIsImlhdCI6MTc1ODc3MjE3OCwiZXhwIjoxNzU4ODU4NTc4LCJ1c2VybmFtZSI6ImExMjM0NSIsInJvbGUiOiJBRE1JTiJ9.Y4b0JyJK-VwqZWrD-kR8lI0VWNfQp449au5evH1v4A0";
        String expiredToken = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ3aGRxaGQ0MTQ5QGdtYWlsLmNvbSIsImlhdCI6MTc1ODc3NjQxNSwiZXhwIjoxNzU4NjkwMDE1LCJ1c2VybmFtZSI6ImExMjM0NSIsInJvbGUiOiJBRE1JTiJ9.MGORVPDUtZ9DYzy4i3SM2PsOBaqWHLdekMs9yjfWztw";

        try{
            jwtProvider.validateToken(expiredToken);
            System.out.println("토큰 이상 없음...");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}