package com.calculadora;

public class Calculadora {
    

    public int somar(int a, int b){
        return a + b;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public int dividir(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Não é possivel dividir por zero.");
        }
        return a / b;
    }
    

}
