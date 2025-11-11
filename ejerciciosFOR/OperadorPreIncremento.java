public class OperadorPreIncremento{
	public static void main(String[] args) {
	int variable = 5;
	System.out.println("Original value of the variable = " + variable);
	int preIncrement = ++variable;
		System.out.println("variable = " + variable);
		System.out.println("preIncrement = " + preIncrement);
		System.out.println("++preIncrement = " + ++preIncrement);
	}
}