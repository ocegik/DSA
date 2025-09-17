package Basics.Strings;

public class PalindromeCheck {
    public static void main(String[] args){
        String word = "Radar";

        boolean isPalindrome = true;

        int wordLength = word.length();

        for(int i = 0; i < wordLength/2; i++){
            if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(wordLength - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome");
        }
    }
}
