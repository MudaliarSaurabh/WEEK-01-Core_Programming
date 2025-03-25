//Write a Java program to count the number of vowels and consonants in a given string.
import java.util.Scanner;
public class VowelsAndConsonents {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String str= scanner.nextLine();
        int count =0;
        int count1 = 0;

        str= str.trim();
        for(int i =0 ; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch>'A' && ch<'Z'){
                ch = (char)(ch +32);
            }

            if(ch>= 'a' && ch<='z'){
                if (ch =='a' ||ch =='e' ||ch =='i' ||ch =='o' ||ch =='u'){
                    count++;

                }else{
                    count1++;
                }
            }


        }
        System.out.println("the count of vowels are " + count);
        System.out.println("the count of consonents are " + count1);

    }
}
