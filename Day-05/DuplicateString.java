import java.util.HashSet;
import java.util.Scanner;

class DuplicateString{
//    public static String removeDup(String str){
//        HashSet<Character> seen = new HashSet<>();
//        StringBuilder result = new StringBuilder();
//
//        for(char ch: str.toCharArray()){
//            if(!seen.contains(ch)){
//                seen.add(ch);
//                result.append(ch);
//            }
//        }
//        return result.toString();
//    }
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        System.out.println(removeDup(str));
//    }

    public static String removeDup(String str){
        boolean[] arr = new boolean[256];
        StringBuilder result = new StringBuilder();
        char ch;
        for(int i =0 ; i< str.length();i++){
            ch = str.charAt(i);
            if(!arr[ch]){
                arr[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();

        System.out.println(removeDup(str));

    }

}
