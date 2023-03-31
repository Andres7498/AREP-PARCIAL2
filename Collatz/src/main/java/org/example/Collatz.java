package org.example;


public class Collatz {
    static String respuesta = "";
    static String inicial="";
    public static void Collatz(Integer num){
        if (num==1) {
            archivo(Integer.toString(num));
        } else if (num%2==1) {
            archivo(Integer.toString(num));
            num = (num*3)+1;
            Collatz(num);
        } else if (num%2==0) {
            archivo(Integer.toString(num));
            num = (num/2);
            Collatz(num);
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
