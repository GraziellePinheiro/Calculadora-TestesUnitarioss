package com.calculadora;

import java.beans.Transient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;


    @BeforeEach
    public void SetUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void testSomar(){
        int res = calculadora.somar(2, 2);
        Assertions.assertEquals(4, res);
    }

    @Test
    public void testSubtrair(){
        int res = calculadora.subtrair(3, 1);
        Assertions.assertEquals(2, res);
    }

    @Test
    public void testMultiplicar(){
        int res = calculadora.multiplicar(2, 2);
        Assertions.assertEquals(4, res);
    }

    @Test
    public void testDividir(){
        int res = calculadora.dividir(4, 2);
        Assertions.assertEquals(2, res);
    }
    
    @Test
    public void testDividirPorZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }
}
