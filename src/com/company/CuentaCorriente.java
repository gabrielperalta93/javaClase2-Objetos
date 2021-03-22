package com.company;

public class CuentaCorriente {
    private double Saldo;

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public CuentaCorriente(){

    }

    public CuentaCorriente(double saldo){
        this.Saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.Saldo = cuentaCorriente.getSaldo();
    }

    public void Ingreso(double montoIngresado){
        this.Saldo = Saldo + montoIngresado;
    }

    public void Egreso(double montoEgresado){
        this.Saldo = Saldo - montoEgresado;
    }

    public void Reintegro(double montoReintegrado){
        this.Saldo = Saldo + montoReintegrado;
    }

    public void Transferencia(double montoTransferido){
        this.Saldo = Saldo - montoTransferido;
    }
}
