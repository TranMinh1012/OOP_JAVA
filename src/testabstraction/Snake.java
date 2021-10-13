package testabstraction;

public class Snake extends Animal{
    private double length;
    public Snake(){

    }
    public Snake(String chirp, double length){
        super(chirp);
        this.length = length;
    }
    @Override
    public void animalAction() {
        System.out.println("Crawl");
    }
}
