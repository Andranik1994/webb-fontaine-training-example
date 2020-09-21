package functionsobjects.persons;

import java.util.Objects;

public class Person {

    String name;
    int age;
    Company company;

    @Override
    public String toString() {
        return name +
                "\nage=" + age +
                "\n" + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(company, person.company);
    }

}
