package cwiczenia.VetClinic;

import java.util.Iterator;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static Animal[] patients;
    private static Lizard[] lizards;
    private static Exotic[] egzotics;

    public static void main(String[] args) {
        prepareData();

        for (Animal patient : patients) {
            patient.showMeasurementsInfo();
        }
        for (Lizard patirnt :
                lizards) {
            System.out.println(patirnt.checkRegistration());
        }
        for (Exotic patient :
                egzotics) {
            System.out.println(patient.checkRegistration());
        }

        LinkedList<Animal> animals = new LinkedList<>();
        animals.add(new Dog("George", new Animal.Owner("John Smith"), "golden retriever", "M"));
        animals.add(new Dog("Alex", new Animal.Owner("Jane Smith"), "bulldog", "M"));
        animals.add(new Dog("Alex", new Animal.Owner("Jane Smith"), "bulldog", "M"));
        animals.add(new Dog("Betty", new Animal.Owner("Patrick White"),
                "chihuahua", "F"));
        animals.add(new Dog("Jasmine", new Animal.Owner("Robert Doe"), "terrier",
                "F"));
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()){
            Animal a = iterator.next();
            System.out.println("Animal " + a.getName());
        }
        animals.forEach(a -> {
            System.out.println(a.getName());
            System.out.println(a.getOwner().getName());
        });
        List<Integer> ints = new LinkedList<>();
        ints.add(1);
        ints.add(2);
        ints.add(2);
        ints.add(3);
        long count = ints.stream().distinct().count();
        System.out.println(count);

        boolean anyMatch = animals.stream().anyMatch(a->a.getName().equals("Alex"));
        System.out.println(anyMatch);
        boolean allMatch = animals.stream().allMatch(a->a.getOwner()!=null);
        System.out.println(allMatch);

        Optional ot = animals.stream()
                .map(a -> a.getOwner())
                .filter(o -> o.getName().endsWith("Smith"))
                .findFirst();
        Animal.Owner owner = (Animal.Owner) ot.get();
        System.out.println(owner.getName());

        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Orange", 4);
        fruits.put("Melon", 2);
        fruits.put("Banana", 7);
        fruits.put("Blueberry", 25);
        fruits.put("Blackberry", 25);
        fruits.put("Strawberry", 30);
        fruits.put("Pineapple", 3);
        int counter = fruits.keySet().stream()
                .filter(name -> name.startsWith("B"))
                .map(name -> fruits.get(name))
                .reduce(0, (a, b) -> a + b);
        System.out.println(counter);

        List<String> list = animals.stream()
                .map(a -> a.getOwner())
                .filter(a -> a.getName().endsWith("Smith"))
                .map(o -> o.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list.size());
        list.forEach(x-> System.out.println(x));

        List<Integer> intsy = Arrays.asList(1, 5, 7, 23, 4, 2, 10);
        intsy.stream()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        List<String> names =
                Arrays.asList("Kelly Smith", "Danny Johnson", "Mary Lee");
                        names.stream()
                                .map(Animal.Owner::new)
                                .collect(Collectors.toList())
                                .forEach(System.out::println);
    }

    private static void prepareData() {
        Dog dogo = new Dog("Alex", new Animal.Owner("John Smith"), "beagle", "M");
        dogo.setWeight(23.5);
        Lizard lizard = new Lizard("Fiona", new Animal.Owner("Jane Doe"), "bearded dragon", "F",
                true);
        lizard.setWeight(20);
        lizard.setLength(25);
        Turtle turtle = new Turtle("Max", new Animal.Owner("Jack White"), "red cheek", "M", true);
        turtle.setWeight(400);
        turtle.setDiameter(30);
        patients = new Animal[]{dogo, lizard, turtle};
        Exotic exotic = new Parrot("Roco", new Animal.Owner("Samuel Johnson"),
                "cockatoo", "M");
        lizards = new Lizard[]{lizard};
        egzotics = new Lizard[]{lizard};

    }
}

