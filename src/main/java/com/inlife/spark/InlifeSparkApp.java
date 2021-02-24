package com.inlife.spark;

import static spark.Spark.*;

public class InlifeSparkApp {
    public static void main(String[] args) {
        port(8090);
        path("/spark/api", () -> {
            before("/*", (q, a) -> System.out.println("Received api call"));
            get("/hello", (req, res) -> "Hello World");
        });
    }
}
