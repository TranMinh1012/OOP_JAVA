package testabstraction;

public class Bird extends Animal implements BirdAction{
    private double wingLength;
    public Bird(){

    }
    public Bird(String chirp, double wingLength){
        super(chirp);
        this.wingLength = wingLength;
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
