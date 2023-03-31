package org.example;

import static spark.Spark.get;

public class SparkWebServer {
    public static void main(String[] args) {
        get("/Collatz", (req, res) -> HttpConnectionExample.Collatz(num));
    }
}