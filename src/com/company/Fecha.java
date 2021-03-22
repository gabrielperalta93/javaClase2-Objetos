package com.company;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha(){

    }

    public Fecha(int anio, int mes, int dia){
        this.validarFecha(mes, dia);
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString(){
        //GregorianCalendar fecha = new GregorianCalendar(1986,Calendar.NOVEMBER, 25);
        GregorianCalendar fecha = new GregorianCalendar(this.anio, this.mes, this.dia);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        return sdf.format(fecha.getTime());
    }

    public void validarFecha(int mes, int dia){
        if (mes > 12 || mes < 1){
            System.out.println("Error en mes");
        }

        if (dia > 31 || dia < 1){
            System.out.println("Error en dia");
        }
    }
}
