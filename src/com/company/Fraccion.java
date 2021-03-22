package com.company;

public class Fraccion {
    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion(){

    }

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public float Sumar(int numerador, int denominador){
        return (this.numerador / this.denominador) + (numerador / denominador);
    }

    public float Restar(int numerador, int denominador){
        return (this.numerador / this.denominador) - (numerador / denominador);
    }

    public float Multiplicar(int numerador, int denominador){
        return (this.numerador / this.denominador) * (numerador / denominador);
    }

    public float Dividir(int numerador, int denominador){
        return (this.numerador / this.denominador) / (numerador / denominador);
    }

    public float Sumar(int enteroSuma){
        return (this.numerador / this.denominador) + enteroSuma;
    }

    public float Restar(int enteroResta){
        return (this.numerador / this.denominador) - enteroResta;
    }

    public float Multiplicar(int enteroMultiplicacion){
        return (this.numerador / this.denominador) * enteroMultiplicacion;
    }

    public float Dividir(int enteroDivision){
        return (this.numerador / this.denominador) / enteroDivision;
    }
}
