package com.acadgild;

import java.util.Arrays;

/**
 * 
 * Program to Sort words in a Sentence and then sort letters within each word.
 *
 */

// Function to sort the elements of Array
public class Session7Assignment2 {

	static void sortArray(String[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// Assign a string to be sorted
		String sentence = new String("My Name Is Deepak");

		// Split the string with space being the delimiter. Results will go to
		// array words.
		String[] words = sentence.split("\\s+");
		System.out.println("Sorting Sentence - " + sentence);

		// Sort the words array
		sortArray(words);
		System.out.println("-------------------------------------");

		String[] letters;

		// Loo through the array to get each word in the sentence
		for (int i = 0; i < words.length; i++) {
			System.out.println("Sorting word - " + words[i]);

			// Convert all letters into lower case and split each element so
			// that each character goes into each element of letters array
			letters = words[i].toLowerCase().split("");

			// Call the sort method to sort each character of array letters.
			sortArray(letters);
		}
	}

}
