import java.util.Random;

public class MedianaModa {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100) + 1;
        }

        //bubble sort

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Posortowana tablica: ");
        for(int i : numbers){
            System.out.print(i + " ");
        }

        //mediana
        double median = 0;
        if(numbers.length % 2 != 0){
            median = numbers[numbers.length / 2];
        }else{
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        }
        System.out.println("\nMediana: " + median);

        //dominanta
        int mode = numbers[0];
        int maxCount = 0;

        for(int i = 0; i < numbers.length; i++){
            int count = 0;
            for(int j = 0; j < numbers.length; j++){
                if(numbers[j] == numbers[i]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                mode = numbers[i];
            }
        }
        System.out.println("Dominanta: " + mode + " (występuje " + maxCount + " razy)");

        //wartość średnią wartości zapisanych w tablicy
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double avg = sum / numbers.length;
        System.out.println("Średnia: " + avg);
    }
}
