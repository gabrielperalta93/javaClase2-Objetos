package com.company;

public class Contador {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Contador(){

    }

    public Contador(double valor){
        this.valor = valor;
    }

    public Contador(Contador contador){
        this.valor = contador.getValor();
    }

    public void incrementarValor(){
        this.valor++;
    }

    public void decrementarValor(){
        this.valor--;
    }
}
