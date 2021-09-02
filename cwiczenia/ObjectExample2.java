package cwiczenia;

import java.util.Objects;

class Dog {
    String name;
    Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(age, dog.age);
    }
}

public class ObjectExample2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Szarik", 13);
        Dog dog2 = new Dog("Penelopa", 10);
        Dog dog3 = new Dog("Pimpus", 1);
        Dog[] dogs = new Dog[]{dog1, dog2, dog3};
        Dog x = new Dog("Szarik", 13);
        System.out.println(x == dog1);
        System.out.println(dog1.toString());
        for (Dog dog : dogs) {
            if (dog.equals(x)) {
                System.out.println(dog.name);
            }
        }
    }
}
