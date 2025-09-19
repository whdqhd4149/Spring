package kr.co.ch04.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisServiceTest {

    private RedisService redisService;

    @Test
    void setValue() {

        // given
        String key = "user1:a101:name";
        String value = "김유신";

        // when
        redisService.setValue(key, value);

        // then
        assertEquals(value, redisService.getValue(key));
    }

    @Test
    void getValue() {
    }

    @Test
    void addToListFromRight() {
    }

    @Test
    void addToListFromLeft() {
    }

    @Test
    void getFromList() {
    }

    @Test
    void getRangeFromList() {
    }

    @Test
    void addToSet() {
    }

    @Test
    void getFromSet() {
    }

    @Test
    void addToHash() {
    }

    @Test
    void getFromHash() {
    }
}