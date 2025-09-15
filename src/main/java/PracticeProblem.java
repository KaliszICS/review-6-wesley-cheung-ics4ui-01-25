public class PracticeProblem {

	public static void main(String args[]) {


	}
	public static int sum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	public static int difference(int num1, int num2) {
		int result;
		result = num1 - num2;
		return result;
	}
	public static double product(double num1, double num2) {
		double result;
		result = num1 * num2;
		return result;
	}
	public static String removeFirst(String sentence) {
		String result;
		result = sentence.substring(1);
		return result;
	}
	public static int combinedLength(String sentence1, String sentence2) {
		int result;
		result = sentence1.length()+sentence2.length();
		return result;
	}
	public static int isEven(int num) {
		return (num%2==0);
	}
	public static int isOdd(int num) {
		return (num%2==0);
	}
	public static int isPositive(int num) {
		return (num>0);
	}
	public static int isNegative(int num) {
		return (num<0);
	}

	

}
