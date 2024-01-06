public class Main {
    public static void main(String[] args) {

        String sentence = "Ana lleva al oso la avellana";

        if (isPalindrome(sentence)){
            System.out.println("The sentence is a palindrome");
        }else {
            System.out.println("The sentence isn't a palindrome");
        }

    }

    public static boolean isPalindrome(String sentence){
        String[] palindrome = {sentence.toLowerCase()};

        for (int i = 0; i < palindrome.length; i++){
            if (palindrome[i].charAt(i) == palindrome[i].charAt(palindrome.length-1-i));
            return true;
        }
        return false;
    }
}