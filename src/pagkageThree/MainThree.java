package pagkageThree;

public class MainThree {
    public static void main(String[] args) {
        Hello s = (name, age) -> "Hello " + name +  " age: " + age;
    //      System.out.println(s.sayHello());
        System.out.println(s.sayHello("Minh", 20));
    }
}
