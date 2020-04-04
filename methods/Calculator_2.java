package methods;

/*2.	Create Calculator class which have 4 methods add(int i, int j),
sub(int i, int j), 
mul(int i, int j), div(int i, int j) with return type double*/

public class Calculator_2 {
	double add(int i, int j) {
		double result = i + j;
		return result;

	}

	double sub(int i, int j) {
		double result = i - j;
		return result;

	}

	double mul(int i, int j) {
		double result = i * j;
		return result;
	}

	public static void main(String[] args) {
		Calculator_2 c = new Calculator_2();
		double add1 = c.add(10, 25);
		System.out.println("Addition-" + add1);

		double sub1 = c.sub(15, 45);
		System.out.println("Substraction-" + sub1);

		double mul1 = c.mul(12, 25);
		System.out.println("Multiplication-" + mul1);

	}

}
