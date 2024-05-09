package com.wocks.bootapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomTest {

    @Test
    @DisplayName("1 + 2 = 3")
    public void test01() {
        int a = 1;
        int b = 2;
        int c = 2;

        assertThat(a + b).isEqualTo(3);
    }

}
