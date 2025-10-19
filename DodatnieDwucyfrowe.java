public class DodatnieDwucyfrowe {
    public static void main(String[] args) {
        int[] numbers = new int[100]; //0 do 99
        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = i;
        }
        for(int num : numbers){
            if((num >= 10) && (num % 2 == 0)){
                System.out.print(num + " ");
            }
        }

        //prostszy sposób
        /*
        for(int i = 10; i < 100; i+=2){
            System.out.print(i + " ");
        }
         */
    }
}
