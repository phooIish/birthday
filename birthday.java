import java.util.Scanner;

public class birthday {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("What are the heights of your candles?");
        //sc within birthdayCandles takes user input for the candle heights.
        System.out.println(birthdayCandles(age));
    }

    static String birthdayCandles(int n){
        int[] candleHeight = new int[n];
        int count = 0, tallest = 0;
        for(int i = 0; i < n; i++){
            candleHeight[i] = sc.nextInt();
            if(candleHeight[i] == tallest){
                count++;
            }
            if(candleHeight[i] > tallest){
                tallest = candleHeight[i];
                count = 1;
            }
        }
        return "Tallest candle = " + tallest + ", Candles blown out = " + count;
    }
}
