package com.ai.starter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMain() {
        // 基础测试
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
