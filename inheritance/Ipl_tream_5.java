package inheritance;
//5.	Create class IPLTeam with method play (). Create child classes of IPLTeam 
//called as CSK, RCB
//. In main, call play () from child class objects

 class Ipl_tream_5 {
  void play() {
	  System.out.println("This is Ipl- Team");
	  
  }
 }
  
  class Csk extends Ipl_tream_5{
	  
	  
  }
  class Rcb extends Ipl_tream_5{
	  
  public static void main(String[] args) {
	Rcb ob=new Rcb();
	System.out.println("using Rcb class object");
	ob.play();
	Csk ob1=new Csk();
	System.out.println("Using Csk class object");
	ob1.play();
	}

}
