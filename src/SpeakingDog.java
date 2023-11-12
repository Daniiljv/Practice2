public class SpeakingDog {
    private String name;
    private double weight;

    public SpeakingDog(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    protected final String gavGav(){
        return "Gav-gav";
    }
}
