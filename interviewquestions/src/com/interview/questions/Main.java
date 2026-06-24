package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.stream.Collectors;

import com.interview.questions.model.Employee;
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

	private static List<String> stringList = Arrays.asList("123abcd","abc", "def", "123", "567", "899", "931", "555", "new",
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

	private static String[] newInputString = {"a1b2c3","b2c3d4","e5f6g7","h8i9j10k11"};
	
	private static int[] newNumArray = {1,2,4,5,6,7};
	
	private static String newInputStringValue = "Programming";
	
	private static String valueString = "aaaabbbbccceeeeffffffff";

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

		System.out.println("The List that contains Only String: "+main.interviewQuestionsServiceImpl.listThatContainsOnlyString(stringList));

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

		System.out.println(main.interviewQuestionsServiceImpl.calculateTheAverage(newArray));

		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1,"Harry Potter",90000.0));
		employee.add(new Employee(2,"Hermione Granger",70000.0));
		employee.add(new Employee(3,"Ronald Weasley",80000.0));
		employee.add(new Employee(4,"Nevile Longbottom",80000.0));
		employee.add(new Employee(5,"Albus DumbleDore",100000.0));

		System.out.println(main.interviewQuestionsServiceImpl.findTheSecondHighestSalary(employee));

		System.out.println(main.interviewQuestionsServiceImpl.findTheSecondHighestSalaryEmployeeObject(employee));


		System.out.println(main.interviewQuestionsServiceImpl.kthSmallElement(newArray, 3));

		System.out.println(main.interviewQuestionsServiceImpl.removeAllNumericCharactersInString(newInputString));

		System.out.println(main.interviewQuestionsServiceImpl.removeAllNonNumericCharactersInString(newInputString));

		System.out.println(main.interviewQuestionsServiceImpl.findTheRepeatedCharacterInString(str));

		System.out.println(main.interviewQuestionsServiceImpl.findTopThreeEmployeesWithHighSalary(employee));


		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);        // false (different references)
		System.out.println(s1.equals(s2));

		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));


		String s5 = "New";
		String s6 = new String("New");
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));

		boolean isStudent = false;
		boolean isActive = false;

		if(isStudent) {
			System.out.println("You are Student");
		}else {
			System.out.println("You are not a student");
		}

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = scanner.nextLine();
//		System.out.println("You are "+ name);
//		scanner.close();


		List<Map<String, Object>> empList = Arrays.asList(
			    Map.of("eid", 1, "name", "Alice"),
			    Map.of("eid", 2, "name", "Bob"),
			    Map.of("eid", 3, "name", "Charlie")
			);

			List<Map<String, Object>> salaryList = Arrays.asList(
			    Map.of("eid", 1, "salary", 60000),
			    Map.of("eid", 2, "salary", 40000),
			    Map.of("eid", 3, "salary", 70000)
			);

			Optional<String> salaryLessthan50 = salaryList
					.stream().filter(e-> (int) e.get("salary") < 50000)
					.map(salary ->{
						int eid = (int) salary.get("eid");
						return empList.stream().filter(emp->(int)emp.get("eid")==eid)
								.map(emp->(String) emp.get("name"))
								.findFirst()
								.orElse(null);
					})
					.findFirst();


			// Create a map of eid -> name for O(1) lookup
			Map<Integer, String> empMap = empList.stream()
			    .collect(Collectors.toMap(
			        emp -> (Integer) emp.get("eid"),
			        emp -> (String) emp.get("name")
			    ));

			System.out.println(empMap);
			// Find name with salary < 50000
			String empName = salaryList.stream()
			    .filter(salary -> (Integer) salary.get("salary") < 50000)
			    .map(salary -> empMap.get((Integer) salary.get("eid")))
			    .findFirst()
			    .orElse(null);

			System.out.println(empName);  // Output: Bob

			System.out.println(salaryLessthan50);
			
			System.out.println(main.interviewQuestionsServiceImpl.countVowelsInString("Welcome World"));
			
			System.out.println(main.interviewQuestionsServiceImpl.isPalindrome("Madam"));
			
			System.out.println(main.interviewQuestionsServiceImpl.reverseAString("Madam"));
			
			main.interviewQuestionsServiceImpl.swapTwoNumbers(10, 15);
			
			System.out.println(main.interviewQuestionsServiceImpl.isArmstrong(9474));
			
			System.out.println(main.interviewQuestionsServiceImpl.findTheMissingNumber(newNumArray, 7));
			
			int[] twoSumResult = main.interviewQuestionsServiceImpl.twoSum(newArray, 10);			
			System.out.println(Arrays.toString(twoSumResult));
			
			main.interviewQuestionsServiceImpl.possibleSubString(newInputStringValue);
			
			main.interviewQuestionsServiceImpl.countExtraCharacters(valueString);
			
			
	}
}
