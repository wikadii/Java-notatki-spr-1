import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class ParzysteNieparzysteKolekcje {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100) + 1;
        }
        ArrayList arrayList = new ArrayList<Integer>();
        LinkedList linkedList = new LinkedList<Integer>();
        HashSet uniqueNumbers = new HashSet<Integer>();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                arrayList.add(numbers[i]);
            }else{
                linkedList.add(numbers[i]);
            }
        }
        System.out.println("Parzyste: " + arrayList);
        System.out.println("Nieparzyste: " + linkedList);

        for(int i = 0; i < numbers.length; i++){
            uniqueNumbers.add(numbers[i]);
        }
        System.out.println("Wylosowano tyle różnych liczb: " + uniqueNumbers.size());
    }
}
