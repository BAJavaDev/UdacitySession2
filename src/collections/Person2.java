package collections;

import java.util.Objects;

public class Person2 {
    private String name;
    private Integer height;
    private Integer age;

    public Person2(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return !Objects.equals(name, person2.name) && Objects.equals(height, person2.height) && Objects.equals(age, person2.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, age);
    }
}
