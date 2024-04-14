package OOP.Records;

import java.util.Objects;

public record Person(String id, String emri){
    public Person {
        Objects.requireNonNull(id);
        Objects.requireNonNull(emri);
    }

    static class Job{
        String jobTitle;
    }
}

class Demo{
    public static void main(String[] args) {
        Person person = new Person("5","Person1");
        Person.Job job = new Person.Job();
    }
}

