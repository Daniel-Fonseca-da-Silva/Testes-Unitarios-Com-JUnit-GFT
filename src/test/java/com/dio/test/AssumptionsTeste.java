package com.dio.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void deveValidarAlgoSomenteNoUsuarioDaniel() {
        Assumptions.assumeTrue("daniel-dev".equals(System.getenv("USER")));
        Assumptions.assumeFalse("fakeUser".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }

}
