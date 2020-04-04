package methods;
//7.	Create a class to print an integer and a character with

//two methods having the same name but different sequence of the 
//integer and the character.
//parameters.For example, if the parameters of the first
//method are of the form (int n, char c), then that of the second 
//method will be of the form (char c, int n).

public class Method_patameter_7 {

	void test(int n, char c) {
        System.out.println(n+" "+c);
	}
	void test(char c,int n) {
		System.out.println(c+" "+n);
		
	}

	public static void main(String[] args) {
		Method_patameter_7 m=new Method_patameter_7();
		m.test(10,'v');
		m.test('p',20);
		

	}
}
