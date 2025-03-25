public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Null reference
        System.out.println("Length of text: " + text.length()); // This will throw NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleException() {
        try {
            String text = null; // Null reference
            System.out.println("Length of text: " + text.length()); // This will cause an exception
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught! String is null.");
        }
    }

    public static void main(String[] args) {
        // Uncomment this line to see the exception first
         generateException();

        // Calling the method that handles the exception
        //handleException();
    }
}
