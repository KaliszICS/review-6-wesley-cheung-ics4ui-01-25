
class Notes {
	public static void main(String[] args) {
		System.out.println(result);
		System.out.println(add(5, 6));

		System.out.println(addS("root"));
		printString("This will print");
	}

	//create a function/method definition it needs to be outside of your main but inside your class
	//return type and return must match
	
	public static int add(int addNum1, int addNum2) {
		int additionResult;
		additionResult = addNum1 + addNum2;
		return additionResult; //What will come back from the fuction and replace it.  Returns stop your function
	}

	public static String addS(String word) {
		String newWord;
		newWord = word + "s";
		return newWord;
	}

	//does not return anything
	public static void printString(String word) {
		System.out.println(word);
	}

	//parameters and return type don't need to match
	public static boolean concatAll(int num, String word, char c) {
		return true;
	}
}
