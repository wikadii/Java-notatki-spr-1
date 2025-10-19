public class PierwiastkiIndexow {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Math.sqrt(i);
            System.out.println(i + ". " + numbers[i]);
        }
    }
}
