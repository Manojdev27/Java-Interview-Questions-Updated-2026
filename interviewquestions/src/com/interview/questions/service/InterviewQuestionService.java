package com.interview.questions.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.interview.questions.model.Employee;


public interface InterviewQuestionService {

	
	//	Find duplicate characters and their count
	public Map<Character,Long> findDuplicateCharacterWithCount(String str);
	
//	Find non repeated character in the provide String
	public List<Character> findNonRepeatedCharacters(String str);
	
	
	// print the first alphabet of the words and the count of words that are started with that alphabet
	public String findFirstAlphabetOfWordAndCountOfWords(List<String> wordString);
	
	
//	Write a Java 8 program to transform the list such that:
//		 
//		-All null values are replaced with the string "Tamil"
//		-All empty or blank values are replaced with the string "English"
//	 
//	All other values remain unchanged
	public List<String> transformTheList(List<String> wordString);
	
	
	// In a sentence String with highest Length
	public String stringWithHighestLength(String string);
	
	// remove the duplicates in the string
	public void removeDuplicatesInString(String newString);
	
	
	// Second highest length in the string
		public Optional<String> secondHighestLengthInString(String stringNew);
		
		
		// seperate the list into odd and even Number In the list
		public void oddAndEvenNumberInTheList(List<Integer> num);
		
		// create a list that contains only integers
		public List<Integer> listThatContainsOnlyIntegers(List<String> numString);
		
		// create a list that contains only integers
		public List<String> listThatContainsOnlyString(List<String> numString);
		
		
		// remove Integers and Special Characters In a String
		public String removeIntegersInString(String oldStr);
		
		//Second Highest String in a list
		public Optional<String> secondHighestLengthInAListOfStrings(List<String> fruitString);
		
		//Group Anagrams
		public Map<String, List<String>> groupAnagrams(List<String> anagrams);
		
		// Group Numbers by range
		public Map<Integer,List<Integer>> groupNumbersByRange(List<Integer> groupNumbers);
		
		// move all zeroes to the front
		public List<Integer> moveAllZeroesToTheFrontOfTheArray(int[] arr);
		
		
		// move all zeroes to the End
		public List<Integer> moveAllZeroesToTheEndOfTheArray(int[] arr);
		
		// return True if the array contains Distinct Elements
		public Boolean returnTrueIfListContainsDistinctValues(int[] arr);
		
		// group strings based on the middle Character
		public Map<Object, List<String>> groupStringsBasedOnMiddleCharacter(String[] arr);
		
		
		// Sum of all elements
		public Integer sumOfAllElementsInAnArray(int[] arr);
		
		// count no of vowels characters in string
		public Map<Character, Long> listOfVowelsAndItsOccurences(String str);
		
		
		// count no of vowels in string for each word
		public void  listOfVowelsAndItsOccurencesInString(String str);
		
		//Sort numbers in ascending and descending format
		public Map<String,List<Integer>> sortNumbersAscendingAndDescending(List<Integer> numList);
		
		// Sum of distinct numbers
		public Integer sumOfAllUniqueNumbers(int[] arr);
		
		// product of each elements in an array
		public List<Integer> productOfArrayElements(int[] arr);
		
		// Calculate the average of the numbers
		public Double calculateTheAverage(int[] arr);

		// Find the Second Highest Salary
		public Optional<Double> findTheSecondHighestSalary(List<Employee> employee);

		// Find the Second Highest Salary Employee Object
		public Optional<Employee> findTheSecondHighestSalaryEmployeeObject(List<Employee> employee);
		//Print the Kth Smallest Element
		public int kthSmallElement(int[] arr, int k);

		// Remove All numeric characters in a string
		public List<String> removeAllNumericCharactersInString(String[] newArr);

		// Remove All Non numeric characters in a string
		public List<String> removeAllNonNumericCharactersInString(String[] newArr);


}
