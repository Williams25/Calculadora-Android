package com.example.myapplication;

public class Calculadora {

    public Double soma(String n1, String n2){
        Double num1 = Double.parseDouble(n1);
        Double num2 = Double.parseDouble(n2);
        Double resultado = num1 + num2;
        return resultado;
    }

    public Double multiplicacao(String n1, String n2){
        Double num1 = Double.parseDouble(n1);
        Double num2 = Double.parseDouble(n2);
        Double resultado = num1 * num2;
        return resultado;
    }

}