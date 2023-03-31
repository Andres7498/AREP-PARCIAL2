package org.example;
import static spark.Spark.*;

public class SparkWebServer {
    public static void main(String[] args) {
        get("/index", (req, res) -> Collatz.secuencia(req.queryParams(Integer.valueOf(name))));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
