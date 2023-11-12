public class Dog {
    private final String name;
    private final double weight;
    private final int age;

    private static int countOfDogs;

    public Dog(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;

        countOfDogs();
    }

    public static void countOfDogs() {
        countOfDogs++;
    }

    public static int getCountOfDogs() {
        return countOfDogs;
    }

    @Override
    public String toString() {
        return "Name of dog is - " + this.name +
                "\nWeight of dog equals - " + this.weight +
                "\nAge of dog equals - " + this.age;
    }
}
