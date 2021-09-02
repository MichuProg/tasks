package cwiczenia;

class Student {
    String firstName;
    String familyName;
    int age;
    boolean isInsured;

    public Student(String firstName, String familyName, int age, boolean isInsured) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
        this.isInsured = isInsured;
    }
}

class Snake {
    int length;

    public Snake(int length) {
        this.length = length;
    }
}

class ObjectsExample {
    public static void main(String[] args) {
        Student student = new Student("Marian", "Pazdzioch", 12, true);
        System.out.println(student.firstName);
        System.out.println(student.familyName);
        System.out.println(student.age);
        System.out.println(student.isInsured);

        Snake snake = new Snake(10);
        System.out.println(snake.length);
    }
}
