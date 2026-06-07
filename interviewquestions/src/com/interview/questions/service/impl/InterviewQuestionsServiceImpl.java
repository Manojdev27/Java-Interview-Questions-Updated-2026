package com.interview.questions.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.interview.questions.model.Employee;
import com.interview.questions.service.InterviewQuestionService;

public class InterviewQuestionsServiceImpl implements InterviewQuestionService{

	@Override
	public Map<Character, Long> findDuplicateCharacterWithCount(String str) {
		
		return str.chars().mapToObj(c->(char) Character.toLowerCase(c)) //converting all in lower cases
				.filter(c-> Character.isLetter(c)) // ignoring spaces
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1) // characters which having count more than one
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

	@Override
	public List<Character> findNonRepeatedCharacters(String str) {

		return str.chars().mapToObj(c->(char) Character.toLowerCase(c)) //converting all in lower cases
				.filter(c-> Character.isLetter(c)) // ignoring spaces
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()==1) // non repeated characters
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

	@Override
	public String findFirstAlphabetOfWordAndCountOfWords(List<String> wordString) {
		Map<Character,Long> wordCount = wordString.stream().filter(word ->!word.isEmpty())
				.map(word->Character.toLowerCase(word.charAt(0)))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		String result = wordCount.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.map(entry->entry.getKey() + "-" + entry.getValue())
		.collect(Collectors.joining(", "));
		return result;
	}

	@Override
	public List<String> transformTheList(List<String> wordString) {
		
		return wordString.stream().map(s-> {
			if(s == null) {
				return "Tamil";
			}
			else if(s.isBlank()) {
				return "English";
			}
			else {
				return s;
			}
		}).collect(Collectors.toList());
	}

	@Override
	public String stringWithHighestLength(String string) {
		
		return Arrays.stream(string.split(" ")).max(Comparator.comparing(String::length)).get();
	}

	@Override
	public void removeDuplicatesInString(String newString) {
		
		newString.chars().mapToObj(c->(char)Character.toLowerCase(c)).filter(c-> Character.isLetter(c))
				.distinct().forEach(System.out::print);
	}

	@Override
	public Optional<String> secondHighestLengthInString(String stringNew) {
		return Optional.ofNullable(Arrays.stream(stringNew.split(" "))
				.sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().orElse(null));
	}

	@Override
	public void oddAndEvenNumberInTheList(List<Integer> num) {
		
		Map<Boolean,List<Integer>> oddAndEven = num.stream()
				.collect(Collectors.partitioningBy(x->x%2 ==0));
		
		List<Integer> oddNumIntegers = oddAndEven.get(false);
		List<Integer> evenNumIntegers = oddAndEven.get(true);
		
		System.out.println("The odd Numbers are: " +oddNumIntegers);
		System.out.println("The even Numbers are: " +evenNumIntegers);
		
	}

	@Override
	public List<Integer> listThatContainsOnlyIntegers(List<String> numString) {
		
		return numString.stream().filter(x->x.matches("[0-9]+")).map(Integer::valueOf)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<String> listThatContainsOnlyString(List<String> numString) {
		
		return numString.stream().filter(x->x.matches("[a-zA-Z]+")).map(String::valueOf)
				.collect(Collectors.toList());
	}

	@Override
	public String removeIntegersInString(String oldStr) {
		return oldStr.replaceAll("[^a-zA-Z]", "");
				
	}

	@Override
	public Optional<String> secondHighestLengthInAListOfStrings(List<String> fruitString) {
		
		return Optional.ofNullable(fruitString.stream().sorted(Comparator.comparing(String::length)
				.reversed()).skip(1).findFirst().orElse(null));
		
	}

	@Override
	public Map<String, List<String>> groupAnagrams(List<String> anagrams) {
		return anagrams.stream()
	            .collect(Collectors.groupingBy(word -> {
	                char[] chars = word.toCharArray();
	                Arrays.sort(chars);
	                return new String(chars);
	            }));
	}

	@Override
	public Map<Integer, List<Integer>> groupNumbersByRange(List<Integer> groupNumbers) {
	
		return groupNumbers.stream().collect(Collectors.groupingBy(x->x/10*10,Collectors.toList()));
	}

	@Override
	public List<Integer> moveAllZeroesToTheFrontOfTheArray(int[] arr) {
	
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		
//		List<Integer> zeroesList = list.stream().filter(x->x==0).collect(Collectors.toList());
//		
//		List<Integer> nonZeroesList = list.stream().filter(x->x!=0).collect(Collectors.toList());
//		
//		List<Integer> finalList = new ArrayList<>();
//		finalList.addAll(zeroesList);
//		finalList.addAll(nonZeroesList);
		
		List<Integer> finalList = list.stream().collect(Collectors.partitioningBy(x->x!=0)).values().stream()
				.flatMap(x->x.stream()).collect(Collectors.toList());
		
		return finalList;
	}

	@Override
	public List<Integer> moveAllZeroesToTheEndOfTheArray(int[] arr) {
        
		List<Integer> list = Arrays.stream(arr).boxed().toList();
//		
//		List<Integer> zeroesList = list.stream().filter(x->x==0).collect(Collectors.toList());
//		
//		List<Integer> nonZeroesList = list.stream().filter(x->x!=0).collect(Collectors.toList());
//		
//		List<Integer> finalList = new ArrayList<>();
//		finalList.addAll(nonZeroesList);
//		finalList.addAll(zeroesList);
		
		List<Integer> finalList = list.stream().collect(Collectors.partitioningBy(x->x==0)).values().stream()
				.flatMap(x->x.stream()).collect(Collectors.toList());
//		
		return finalList;
	}

	@Override
	public Boolean returnTrueIfListContainsDistinctValues(int[] arr){
		
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		Map<Integer,Long> countMap = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		Collection<Long> value = countMap.values();
		boolean distinctMatcher = value.stream().noneMatch(x->x > 1);
		
		return distinctMatcher;
	}

	@Override
	public Map<Object, List<String>> groupStringsBasedOnMiddleCharacter(String[] arr) {
		List<String> stringList = Arrays.stream(arr).toList();
		Map<Object, List<String>> stringMap = stringList.stream()
				.collect(Collectors.groupingBy(x->x.toString().substring(1, 2)));
		return stringMap;
	}

	@Override
	public Integer sumOfAllElementsInAnArray(int[] arr) {
		List<Integer> sumList = Arrays.stream(arr).boxed().toList();
		return sumList.stream().mapToInt(Integer::intValue).sum();
	}

	@Override
	public Map<Character, Long> listOfVowelsAndItsOccurences(String str) {
		
		return str.chars().mapToObj(c->(char) c).filter(x->"[^aeiouAEIOU]".indexOf(x)>=0)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}

	@Override
	public void listOfVowelsAndItsOccurencesInString(String str) {
		
		Arrays.stream(str.split(" ")).filter(word-> !word.isEmpty())
		.forEach(word -> {
			Long count = word.chars().mapToObj(c->(char) c)
			.filter(c-> "[^aeiouAEIOU]".indexOf(c) >=0).count();
			
			System.out.println(word + " -> "+ count + " vowel(s)");
			});
	}

	@Override
	public Map<String,List<Integer>> sortNumbersAscendingAndDescending(List<Integer> numList) {
		List<Integer> ascendingNumbers = numList.stream().sorted().toList();
		List<Integer> descendingNumbers = numList.stream().sorted(Comparator.reverseOrder()).toList();
		
		Map<String,List<Integer>>ascendingAndDescending = new HashMap<>();
		ascendingAndDescending.put("ascending" ,ascendingNumbers);
		ascendingAndDescending.put("descending", descendingNumbers);
		
		return ascendingAndDescending;
	}

	@Override
	public Integer sumOfAllUniqueNumbers(int[] arr) {
		List<Integer> sumList = Arrays.stream(arr).boxed().toList();
		return sumList.stream().distinct().mapToInt(Integer::intValue).sum();
	}

	@Override
	public List<Integer> productOfArrayElements(int[] arr) {
		
		List<Integer> numList = Arrays.stream(arr).boxed().toList();
	
		return numList.stream()
			    .map(n -> Arrays.stream(arr)
			            .filter(x -> x != n)
			            .reduce(1, (x, y) -> x * y))
			        .toList();
	}

	@Override
	public int kthSmallElement(int[] arr, int k) {
		List<Integer> arrList = Arrays.stream(arr).boxed().toList();
		return arrList.stream().sorted().skip(k-1).findFirst().get();
	}

	@Override
	public List<String> removeAllNumericCharactersInString(String[] newArr) {
		List<String> arrList = Arrays.stream(newArr).toList();
		Pattern pattern = Pattern.compile("[0-9]");
		return arrList.stream().map(x->pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
	}

	@Override
	public List<String> removeAllNonNumericCharactersInString(String[] newArr) {
		List<String> arrList = Arrays.stream(newArr).toList();
		Pattern pattern = Pattern.compile("[^0-9]");
		return arrList.stream().map(x->pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
	}

	@Override
	public Double calculateTheAverage(int[] arr) {
		List<Integer> numList = Arrays.stream(arr).boxed().toList();
		return numList.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
	}

	@Override
	public Optional<Double> findTheSecondHighestSalary(List<Employee> employee) {
		return employee.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst();

	}

	@Override
	public Optional<Employee> findTheSecondHighestSalaryEmployeeObject(List<Employee> employee) {

		return employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst();

	}

}
