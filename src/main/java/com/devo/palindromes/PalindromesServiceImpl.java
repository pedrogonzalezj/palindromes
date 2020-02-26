package com.devo.palindromes;

import java.util.regex.Pattern;

public class PalindromesServiceImpl implements PalindromesService {

    private Pattern pattern;

    public PalindromesServiceImpl() {
        pattern = Pattern.compile("[^\\w]");
    }

    public boolean checkForPalindrome(final String word) {
        if (word == null || "".equals(word)) {
            return false;
        }
        final char[] letters = pattern.matcher(word.toLowerCase()).replaceAll("").toCharArray();
        if (letters.length == 1) {
            return true;
        }
        for (int i = (letters.length/2)-1; i>=0; i--) {
            if(letters[i] != letters[letters.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
