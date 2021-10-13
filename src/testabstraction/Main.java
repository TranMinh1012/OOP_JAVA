package testabstraction;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalAction();
        Bird myBird = new Bird();
        myBird.animalAction();
        Snake mySnake = new Snake();
        mySnake.animalAction();
    }
}
