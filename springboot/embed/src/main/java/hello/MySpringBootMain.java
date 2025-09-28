package hello;

import hello.boot.MySpringApplication;
import hello.boot.MySpringBootApplication;

@MySpringBootApplication
public class MySpringBoot {
    public static void main(String[] args) {
        System.out.println("MySpringBoot.main");
        MySpringApplication.run(MySpringBoot.class, args);
    }
}
