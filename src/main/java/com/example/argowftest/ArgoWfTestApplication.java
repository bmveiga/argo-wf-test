package com.example.argowftest;

import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArgoWfTestApplication {

    public static void main(String[] args) {
        if (args.length > 0 && "myMethod".equals(args[0])) {
            myMethod();
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(i + args[i]);
            }
            System.out.println("Hello world");
        }
    }

    public static void myMethod() {
        System.out.println("Running specific method");
    }
}
