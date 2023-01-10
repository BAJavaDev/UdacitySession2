package collections;

public class Person implements Comparable<Person> {
    private String name;
    private Integer height;
    private Integer age;

    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age.compareTo(o.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
