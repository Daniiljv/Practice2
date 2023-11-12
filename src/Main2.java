import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
       /* Circle circle1 = new Circle("White", 15);
        Circle circle2 = new Circle("Red", 10);

        System.out.println(circle1);
        System.out.println(circle2);*/

        final int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};

        for ( int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
            System.out.print(array[i] + " ");
        }
    }
}
