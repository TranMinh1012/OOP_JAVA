package testabstraction;

public class Snake extends Animal implements SnakeAction{
    private double length;
    public Snake(){

    }
    public Snake(String chirp, double length){
        super(chirp);
        this.length = length;
    }

    @Override
    public void crawl() {
        System.out.println("Crawl");
    }
}
