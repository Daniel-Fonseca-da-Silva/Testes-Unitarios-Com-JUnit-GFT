package com.dio.test;

import org.junit.jupiter.api.*;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemDeTeste {

//    @Order(4)
    @Test
    @DisplayName("A")
    void deveValidarFluxoA() {
        Assertions.assertTrue(true);
    }

//    @Order(3)
    @Test
    @DisplayName("B")
    void deveValidarFluxoB() {
        Assertions.assertTrue(true);
    }

//    @Order(2)
    @DisplayName("C")
    @Test
    void deveValidarFluxoC() {
        Assertions.assertTrue(true);
    }

//    @Order(1)
    @Test
    @DisplayName("D")
    void deveValidarFluxoD() {
        Assertions.assertTrue(true);
    }
}
