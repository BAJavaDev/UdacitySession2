package collections;

// only allowed one comparable
public class Person implements Comparable<Person> {
    private String name;
    private Integer height;
    private Integer age;

    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

   /* The method should return 0 if one integer is equal to the other integer.
   A value less than 0 is returned if this integer is less than the integer passed in
   and a value greater than 0 if this integer is greater than the integer passed in.
   **/
    @Override
    public int compareTo(Person o) {
       // return this.age-o.getAge();
        return this.age.compareTo(o.age);
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
