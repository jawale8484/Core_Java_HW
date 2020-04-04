package constructor_problem_st_shapes;

public class circle {
	public float radius, pi;

	public circle() {
		this.radius = 1.5f;
	}

	public circle(float radius) {
		this(5.3f, 3.14f);
		this.radius = radius;
	}

	public circle(float radius, float pi) {
		this.pi = 3.5f;
		this.radius = radius;
	}

	float calculateCircleArea() {
		System.out.println(pi+" area method "+radius);
		float area = pi * radius * radius;
		return area;
	}

	float calculateCircumference() {
		float circumference = 2 * pi * radius;
		return circumference;
	}

	public static void main(String[] args) {
		circle ob = new circle(1.8f);
		float area=ob.calculateCircleArea();
		float circumference=ob.calculateCircumference();
	
	System.out.println("area of circle is "+area);
	System.out.println("circumference of circle is "+circumference);
	}
}
