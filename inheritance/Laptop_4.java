package inheritance;

/*4.	Create Class Laptop which has variables noOfUSBPort, processorSpeed
of type int. Create getter, setter methods for the variables.
In main method, create Laptop object set values of variables 
noOfUSBPort, processorSpeed using setter methods.
Print variables noOfUSBPort, processorSpeed using getter methods.*/

public class Laptop_4 {
	int noOfUSBport, processorspeed;

	public int getNoOfUSBport() {
		return noOfUSBport;
	}

	public void setNoOfUSBport(int noOfUSBport) {
		this.noOfUSBport = noOfUSBport;
	}

	public int getProcessorspeed() {
		return processorspeed;

	}

	public void setProcessorspeed(int processorspeed) {
		this.processorspeed = processorspeed;
	}

	public static void main(String[] args) {
		Laptop_4 ob = new Laptop_4();
		ob.setNoOfUSBport(25);
		ob.setProcessorspeed(12);
		ob.getNoOfUSBport();
		ob.getProcessorspeed();

		int get = ob.getNoOfUSBport();
		System.out.println("Number of USB-" + get);
		int getp = ob.getProcessorspeed();
		System.out.println("Number of processor-" + getp);

	}

}
