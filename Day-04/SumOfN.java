import java.util.Scanner;
public class SumOfN {
    public int addition(int n){
        int sum = 0;
        for(int i =0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        SumOfN son = new SumOfN();

        int total = son.addition(num);
        System.out.println(total);
    }
}
