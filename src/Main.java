public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog ("fasdf", 123, 3);
        dog1 = new Dog("dsdd",123,3);
        Dog dog2 = new Dog("DFd",1223,56);
        Dog dog3 = new Dog("gsdtsg",3245,545);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println(Dog.getCountOfDogs());
    }
}