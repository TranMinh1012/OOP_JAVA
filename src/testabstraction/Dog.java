package testabstraction;

public class Dog extends Animal{
    private String featherColor;
    public Dog(){

    }
    public Dog(String chirp, String featherColor){
        super(chirp);
        this.featherColor = featherColor;
    }
    @Override
    public void animalAction() {
        System.out.println("Bark");
    }
}
