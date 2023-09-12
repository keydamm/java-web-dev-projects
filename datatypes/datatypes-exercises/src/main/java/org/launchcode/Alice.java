package org.launchcode;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String wonderland = "Alice was beginning to get very tired" +
                "of sitting by her sister on the bank," +
                "and of having nothing to do:" +
                "once or twice she had peeped into the book" +
                "her sister was reading, but it had no pictures" +
                "or conversations in it, 'and what is the use" +
                "of a book,' thought Alice" +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term within this phrase:" + wonderland);

        String searchTerm = input.nextLine();
        searchTerm.toLowerCase();
        String found = String.valueOf(wonderland.toLowerCase().contains(searchTerm));

        System.out.println("Your search term of " + searchTerm + " was found:" + found);
    }
}
