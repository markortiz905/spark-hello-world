package com.inlife.spark;

import spark.servlet.SparkApplication;

import static spark.Spark.*;

public class InlifeSparkApp implements SparkApplication {
    @Override
    public void init() {
        main(new String[]{""});
    }

    @Override
    public void destroy() {
        System.out.println("InlifeSparkApp shutting down...");
    }

    public static void main(String[] args) {
        port(8090);
        path("/spark/api", () -> {
            before("/*", (q, a) -> System.out.println("Received api call"));
            get("/hello", (req, res) -> "Hello World");
        });
    }
}
