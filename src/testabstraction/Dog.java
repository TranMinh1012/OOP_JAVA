package testabstraction;

public class Dog extends Animal implements DogAction{
    private String featherColor;
    public Dog(){

    }
    public Dog(String chirp, String featherColor){
        super(chirp);
        this.featherColor = featherColor;
    }

    @Override
    public void bark() {
        System.out.println("Bark");
    }
}
