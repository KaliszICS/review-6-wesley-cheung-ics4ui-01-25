class Notes {
	public static void main(String[] args) {
		int num = add(5, 3); //the values you provide to the function are called arguments
		System.out.println(num);
		System.out.println(add(1, 3));
		printString("Hello");
	}

	//All function and method definitions should be outside your main method
	//function definitions DO NOT RUN unless they are called.

	//public - your function can be accessed by anyone
	//static - your function can be used without creating an object (this is makes it a function not a method)
	//int - return type, the return of your function must match this data type
	//add - function name
	//int num1, int num2 - parameters, variable declarations that the arguments will be assigned to (inputs)
	public static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result; //replaces where the function was called with this value
		//when you return, your function stops
	}

	//void return type means you don't NEED a return
	public static void printString(String word) {
		System.out.println(word);
	}

	public static boolean doesRandomThings(int num, String word, char c) {
		return true;
	}
}