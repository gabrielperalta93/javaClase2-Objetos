package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valor para ejercio 1");
        int saldo = scanner.nextInt();

	    CuentaCorriente cta = new CuentaCorriente(saldo);
	    cta.getSaldo();
	    System.out.println("Ejercicio 1, Saldo: " + cta.getSaldo());

        System.out.println("Ingrese valor para ejercio 2");
        int valor = scanner.nextInt();
	    Contador contador = new Contador(valor);
	    Contador contadorCopia = new Contador(contador);
	    System.out.println("Ejercicio 2, Contador: " + contador.getValor());
	    System.out.println("Ejercicio 2, Contador Copia: " + contadorCopia.getValor());

	    Libro libro = new Libro("El Señor de los Anillos", "Tolkien", "Ed: 1992");
	    System.out.println("Ejercicio 3: " + libro.toString());

	    Fraccion fraccion = new Fraccion(12, 2);
        System.out.println("Ejercicio 4: Fraccion es '" + fraccion.getNumerador() + "/" + fraccion.getDenominador() + "' sumar fraccion: " + fraccion.Sumar(10, 4));
        System.out.println("Ejercicio 4: Fraccion es '" + fraccion.getNumerador() + "/" + fraccion.getDenominador() + "' multiplicar fraccion: " + fraccion.Multiplicar(10, 4));
        System.out.println("Ejercicio 4: restar entero: " + fraccion.Sumar(12));

        Fecha fecha = new Fecha(1992, 12, 2);
        System.out.println("Ejercicio 5: fecha: " + fecha.toString());

        StringUtil stringUtil = new StringUtil("hola mundo esto es una cadena para comprobarc");
        System.out.println("Ejercicio 6: string util left: " + stringUtil.ltrim(stringUtil.getCadena()));
        System.out.println("Ejercicio 6: string util rigth: " + stringUtil.rtrim(stringUtil.getCadena()) +".");
        System.out.println("Ejercicio 6: string util rigth and left: " + stringUtil.trim(stringUtil.getCadena()) +".");
        System.out.println("Ejercicio 6: string util index of N: " + stringUtil.indexOfN(stringUtil.getCadena(),'c',4));
    }
}
