package abstraction_interface;

interface Cake_5 {
	void bake();
}
interface Icecream{
	void eat();
	void juice();
	void drink();
}

class StrawBerry implements Cake_5{

	@Override
	public void bake() {
		System.out.println("\nBake method in interface cake ");
		
	}
	
}
class BlackForest{
	
}
class mango implements Cake_5,Icecream{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("\nEat method in Icecream interface");
	}

	@Override
	public void juice() {
		// TODO Auto-generated method stub
		System.out.println("\nJuice method in Icecream Interface");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("\nDrink method in Icecream Interface");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Bake method in Icecream Interface");
	}
	public static void main(String[] args) {
		mango ob=new mango();
		ob.bake();
		ob.eat();
		ob.juice();
		ob.drink();
	}
}