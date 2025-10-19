import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int[] fibonacci = new int[40];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for(int num : fibonacci){
            System.out.println(num);
        }
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        scanner.close();

        int index = binarySearchClosestNumber(fibonacci, userNum);
        System.out.println("Najbliższa liczba to: " + fibonacci[index] + ", na indexie nr. " + index);
    }
    private static int binarySearchClosestNumber(int[] array, int num){
        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(array[mid] == num){
                return mid;
            }else if(array[mid] < num){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        if(right < 0) return 0;
        if(left >= array.length) return array.length - 1;
        //math.abs nie potrzebne
        if(Math.abs(array[left] - num) < Math.abs(array[right] - num)){
            return left;
        }else{
            return right;
        }
    }
}

