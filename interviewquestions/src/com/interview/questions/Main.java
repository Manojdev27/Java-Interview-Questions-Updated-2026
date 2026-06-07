package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.interview.questions.service.impl.InterviewQuestionsServiceImpl;

public class Main {

	private InterviewQuestionsServiceImpl interviewQuestionsServiceImpl = new InterviewQuestionsServiceImpl();

	private static String str = "The Boy Who Lived";

	private static String newString = "The mouse that the cat hit that the dog bit that the fly landed on ran away.";

	private static List<String> words = Arrays.asList("boil", "cat", "apple", "dog", "doOrDie", "ant", "ball", "doll",
			"doctor");

	private static List<String> list = Arrays.asList("India", null, " ", "USA", "", "Japan");

	private static List<Integer> newIntegerList = Arrays.asList(171,150,120,130,10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
			24, 25);

	private static List<String> stringList = Arrays.asList("abc", "def", "123", "567", "899", "931", "555", "new",
			"old");

	private static String specialString = "123abcABCdefXYZ567@786!";

	private static List<String> fruitsString = Arrays.asList("Banana", "Apple", "Dragon fruit", "JackFruit");

	private static List<String> anagramWords = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "god", "dog");

	private static int[] arr = { 1, 0, 2, 0, 3, 4, 5, 0, 7, 8, 0, 9, 0, 10, 0, 11, 12, 12, 11 };

	private static int[] newArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	
	private static int[] notUniqueArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8,2,4,5,6,7,9};

	private static String[] stringArray = { "Apple", "Bat", "Cat", "Dog", "Elephant", "Fridge", "Good", "Hat", "Igloo",
			"Job" };

	private static int[] input = {1, 2, 3, 4};

	public static void main(String[] args) {

		Main main = new Main();
		Map<Character, Long> result = main.interviewQuestionsServiceImpl.findDuplicateCharacterWithCount(str);
		System.out.println("Find duplicate characters and their count:" + result);

		List<Character> nonRepeatedCharacterResult = main.interviewQuestionsServiceImpl.findNonRepeatedCharacters(str);
		System.out.println("Find Non repeated characters and their count:" + nonRepeatedCharacterResult);

		System.out.println(main.interviewQuestionsServiceImpl.findFirstAlphabetOfWordAndCountOfWords(words));

		System.out.println(main.interviewQuestionsServiceImpl.transformTheList(list));

		System.out.println(main.interviewQuestionsServiceImpl.stringWithHighestLength(newString));

		main.interviewQuestionsServiceImpl.removeDuplicatesInString(newString);

		System.out.println("");

		System.out.println(main.interviewQuestionsServiceImpl.secondHighestLengthInString(newString));

		main.interviewQuestionsServiceImpl.oddAndEvenNumberInTheList(newIntegerList);

		System.out.println(main.interviewQuestionsServiceImpl.listThatContainsOnlyIntegers(stringList));

		System.out.println(main.interviewQuestionsServiceImpl.listThatContainsOnlyString(stringList));

		System.out.println(main.interviewQuestionsServiceImpl.removeIntegersInString(specialString));

		System.out.println(main.interviewQuestionsServiceImpl.secondHighestLengthInAListOfStrings(fruitsString));

		System.out.println(main.interviewQuestionsServiceImpl.groupAnagrams(anagramWords));

		System.out.println(main.interviewQuestionsServiceImpl.groupNumbersByRange(newIntegerList));

		System.out.println(main.interviewQuestionsServiceImpl.moveAllZeroesToTheFrontOfTheArray(arr));

		System.out.println(main.interviewQuestionsServiceImpl.moveAllZeroesToTheEndOfTheArray(arr));

		System.out.println(main.interviewQuestionsServiceImpl.returnTrueIfListContainsDistinctValues(newArray));

		System.out.println(main.interviewQuestionsServiceImpl.groupStringsBasedOnMiddleCharacter(stringArray));
		
		System.out.println(main.interviewQuestionsServiceImpl.sumOfAllElementsInAnArray(newArray));
		
		System.out.println(main.interviewQuestionsServiceImpl.listOfVowelsAndItsOccurences(newString));
		
		main.interviewQuestionsServiceImpl.listOfVowelsAndItsOccurencesInString(newString);
		
		System.out.println(main.interviewQuestionsServiceImpl.sortNumbersAscendingAndDescending(newIntegerList));
		
		System.out.println(main.interviewQuestionsServiceImpl.sumOfAllUniqueNumbers(notUniqueArray));
		
		System.out.println(main.interviewQuestionsServiceImpl.productOfArrayElements(input));
	}
}
