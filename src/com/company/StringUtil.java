package com.company;

public class StringUtil
{
    private String cadena;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public StringUtil(){

    }

    public StringUtil(String cadena){
        this.cadena = cadena;
    }

    public static String rpad(String s, int n, char c)
    {
        while(s.length() < n){
            s = s + c;
        }
        return s;
    }

    public static String ltrim(String s){
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        return s.substring(i);
    }

    public static String rtrim(String s) {
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        return s.substring(0,i+1);
    }

    public static String trim(String s) {
        return s.trim();
    }

    //si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
    //segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.
    public static int indexOfN(String s, char c, int n){
        int numeroFinal = 0;
        int indice = s.trim().indexOf(c);
        if (indice == -1){
            return -1;
        }else{
            char[] caracteres = s.toCharArray();
            indice = 0;
            int contador = 0;
            for (int i = 0; i < caracteres.length; i++){
                if(caracteres[i] == c){
                    indice = i;
                    contador++;
                }
                if(contador == n){
                    break;
                }
            }
        }
        return indice;
    }
}
