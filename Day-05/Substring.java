//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
//Hint =>
//Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
//Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result

public class Substring {
    public static String Subchar(String str, int Start , int End){
        String str2 = "";
        for(int i = Start ; i<= End; i++){

            str2 += str.charAt(i);

        }
        return str2;
    }

}
