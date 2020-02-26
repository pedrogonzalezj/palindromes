package com.devo.palindromes;



import java.util.Scanner;


public class App {
    public static void main( String[] args ) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Exited from Palindromes checker program")));
        final PalindromesService service = new PalindromesServiceImpl();
        final Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Palindrome> ");
            final String word = scanner.nextLine();
            final boolean isPalindrome = service.checkForPalindrome(word);
            System.out.println("Word " +  word + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
        }
    }
}
