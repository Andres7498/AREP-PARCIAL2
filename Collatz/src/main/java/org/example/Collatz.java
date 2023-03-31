package org.example;


public class Collatz {
    static String respuesta = "";

    static String inicial="";
    public static void secuencia(Integer name){
        if (name==1) {
            archivo(Integer.toString(name));
            json(String respuesta, String inicial);
        } else if (name%2==1) {
            archivo(Integer.toString(name));
            name = (name*3)+1;
            secuencia(name);
        } else if (name%2==0) {
            archivo(Integer.toString(name));
            name = (name/2);
            secuencia(name);
        }
    }
    public static void archivo(String num){
        respuesta += num + "->";
    }
    public static String json(String respuesta, String inicial){
        return "{"+


            "operation\": \"collatzsequence,"+

                "input\": "+ inicial+

                "output\": "+ respuesta+

                "}";
    }
}
