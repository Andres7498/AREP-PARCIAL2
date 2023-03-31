package org.example;

import static spark.Spark.*;

public class SparkWebServer {
    public static void main(String[] args) {
        //llamado a la funcione de collatz
        get("/Collatz", (req, res) -> Collatz(req.queryParams()));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}