

public class Main4 {
    public static void main(String[] args) {
       final ArrayOfCircles[] arrayOfCircles = new ArrayOfCircles[7];

        arrayOfCircles[0] = new ArrayOfCircles(2,3,4,5,"White");
        arrayOfCircles[1] = new ArrayOfCircles(13,34,34,45, "Yellow");
        arrayOfCircles[2] = new ArrayOfCircles(13,34,34,45, "Red");
        arrayOfCircles[3] = new ArrayOfCircles(13,34,34,45, "Black");
        arrayOfCircles[4] = new ArrayOfCircles(13,34,34,45, "Pink");
        arrayOfCircles[5] = new ArrayOfCircles(13,34,34,45, "Green");
        arrayOfCircles[6] = new ArrayOfCircles(13,34,34,45, "Purple");

        for(ArrayOfCircles array: arrayOfCircles){
            array.circleInfo();
        }

    }
}
