package com.dio.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;

public class CondicionaisTeste {

    @Test
//    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
//    @EnabledIfEnvironmentVariable(named = "USER", matches = "daniel-dev")
//    @EnabledOnOs(OS.LINUX)
//    @EnabledOnOs({OS.LINUX, OS.WINDOWS, OS.MAC})
//    @EnabledOnJre(JRE.JAVA_11)
    @EnabledForJreRange(min = JAVA_8, max = JAVA_11)
    void deveValidarAlgoSomenteNoUsuarioDaniel() {
        Assertions.assertEquals(10, 5+5);
    }

}
