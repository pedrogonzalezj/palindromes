package com.devo.palindromes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromesServiceImplTests {

    private PalindromesService service;

    @BeforeEach
    public void setup() {
        service = new PalindromesServiceImpl();
    }

    @Test
    @DisplayName("empty and null words are not palindromes")
    public void assertThatEmptyWordsAreNotPalindromes() {
        assertFalse(service.checkForPalindrome(null));
        assertFalse(service.checkForPalindrome(""));
    }

    @Test
    @DisplayName("one letter words are  palindromes")
    public void assertThatOneLetterWordsAreAlwaysPalindromes() {
        assertTrue(service.checkForPalindrome("a"));
        assertTrue(service.checkForPalindrome("b"));
        assertTrue(service.checkForPalindrome("c"));
    }

    @Test
    @DisplayName("more than one letter words may or not be palindromes")
    public void assertThatCanCheckPalindromeExistence() {
        assertTrue(service.checkForPalindrome("A but tuba"));
        assertTrue(service.checkForPalindrome("A car, a man, a maraca"));
        assertTrue(service.checkForPalindrome("A dog, a plan, a canal: pagoda"));
        assertFalse(service.checkForPalindrome("potatoe"));
    }
}
