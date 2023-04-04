package net.sgenette.springbootdocker.greeting;

import jakarta.validation.constraints.Pattern;

public class Person {
    @Pattern(regexp = "^[A-Za-z]{1,20}")
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}