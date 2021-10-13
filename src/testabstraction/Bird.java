package testabstraction;

public class Bird extends Animal{
    private double wingLength;
    public Bird(){

    }
    public Bird(String chirp, double wingLength){
        super(chirp);
        this.wingLength = wingLength;
    }
    @Override
    public void animalAction() {
        System.out.println("Fly");
    }
}
