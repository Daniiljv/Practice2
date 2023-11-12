public class ArrayOfCircles {
    private final double axisX;
    private final double axisY;
    private final double width;
    private final double height;
    private final String color;

    public ArrayOfCircles(double axisX, double axisY, double width, double height, String color){
        this.axisX = axisX;
        this.axisY = axisY;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void circleInfo() {
        System.out.println("Circle Information:");
        System.out.println("Position: (" + axisX + ", " + axisY + ")");
        System.out.println("Width: " + width);
        System.out.println("height: " + height);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
