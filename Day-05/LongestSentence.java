//longest word in a sentence
// This is a sentence

import java.util.Scanner;



class LongestSentence{
    public static String Longest(String str){
        int maxLength= 0;
        String LongestWord = "";

        int i = 0 , wordstart = 0;

        while(i<=str.length()){
            if(i==str.length() || str.charAt(i) == ' '){
                int wordlength = i - wordstart;
                if(wordlength>maxLength){
                    maxLength = wordlength;
                    LongestWord = str.substring(wordstart , i);

                }
                wordstart= i+1;
            }
            i++;
        }
        return LongestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scanner.nextLine();

        String result = Longest(str);
        System.out.println("Longest word: " + result);

        scanner.close();
    }
}