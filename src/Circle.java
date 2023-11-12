public class Circle {
    private final double PI = 3.14;

    private String color;
    private double radius;

    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Color of circle - " + this.color +
                "\nLength of circle equals - " + radius * PI +
                "\nSquare of circle equals - " + radius * (Math.pow(PI,2)) + "\n";

    }
}
