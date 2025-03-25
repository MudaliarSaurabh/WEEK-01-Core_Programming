import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        scanner.close();
        String revStr = "";
        for(int i = str.length()-1; i>=0; i--){
            revStr += str.charAt(i);
        }


        if(str.equals(revStr)){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }


}
