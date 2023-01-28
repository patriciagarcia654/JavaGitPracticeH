public class Add extends AddMult{
	@Override
	public void displayAction(){
		System.out.println("You Chose To Add Your Input"); 	
	}
	@Override
	public void calc(double input1, double input2){
		double addResult = input1 + input2; 
		System.out.println("Addition Results: " + addResult); 
	}


}
