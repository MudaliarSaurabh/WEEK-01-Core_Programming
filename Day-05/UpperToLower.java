//Write a Java program to toggle the case of each character in a given string. Convert
//uppercase letters to lowercase and vice versa.

public class UpperToLower {
    public static String CaseSwitch(String str){
        for(int i =0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == Character.toLowerCase(str.charAt(i))) {  // Correct
                ch = Character.toUpperCase(str.charAt(i));
            } else if (ch != Character.toLowerCase(str.charAt(i))) {
                ch = Character.toLowerCase(str.charAt(i));
            }
        }
    }
}
