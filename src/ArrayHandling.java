import java.util.*;
public class ArrayHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> arrayContainAllEvenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> arrayContainValueOfInputMultipliedByTwo = new ArrayList<Integer>();
        int sumOfElements = 0;
        for(int i = 0; i < 10; i++){
            input.add(sc.nextInt());
            sumOfElements += input.get(i);
            if(input.get(i)%2==0){
                arrayContainAllEvenNumbers.add(input.get(i));
            }
            arrayContainValueOfInputMultipliedByTwo.add(input.get(i)*2);
        }
        System.out.println(sumOfElements);
        for(int i = 0; i < 10; i++){
            if(input.get(i) < 0){
                System.out.println(input.get(i));
                break;
            }
        }
        for(int i = 0; i < arrayContainAllEvenNumbers.size(); i++){
            System.out.print(arrayContainAllEvenNumbers.get(i) + " ");
        }
        System.out.println(1);
        for(int i = 0; i < arrayContainValueOfInputMultipliedByTwo.size(); i++){
            System.out.print(arrayContainValueOfInputMultipliedByTwo.get(i) + " ");
        }
    }
}
