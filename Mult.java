public class Mult extends AddMult{
	@Override
	public void displayAction(){
		System.out.println("You Chose To Multiply Your Input"); 
	
	}
	@Override
	public void calc(double input1, double input2){
		double multResults = input1 * input2; 
		System.out.println("Multiplication Results: " + multResults); 
	}



}
