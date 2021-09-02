/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solutions;

import java.util.Scanner; //imports Scanner class

public class Solution04 {
    /*
    Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective
        create Scanner object 'scan'
        create String objects 'noun' 'verb' 'adverb' and 'adjective'
        prompt user for 'noun' 'verb' 'adverb' and 'adjective'
        take in 'noun' 'verb' 'adverb' and 'adjective'
    and injects those into a story that you create.
        create a short story
        use string interpolation to inject String objects
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); //scanner object
        String noun,verb,adverb,adjective; //String objects

        System.out.print("Enter a noun: "); //prompt user for 'noun'
        noun = scan.nextLine(); //take in 'noun'
        System.out.print("Enter a verb: "); //prompt user for 'verb'
        verb = scan.nextLine(); //take in 'verb'
        System.out.print("Enter a adverb: "); //prompt user for 'adverb'
        adverb = scan.nextLine(); //take in 'adverb'
        System.out.print("Enter an adjective: "); //prompt user for 'adjective'
        adjective = scan.nextLine(); //take in 'adjective'

        System.out.printf("I have a(n) %s hatred for %s, so much so that I'd %s %s for it.", adjective, noun, verb,adverb );

    }
}
