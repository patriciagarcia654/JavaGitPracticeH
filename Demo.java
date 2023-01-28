import java.util.Scanner; 
import java.util.InputMismatchException; 
public class Demo{
	public static void main(String[] args){
		Scanner k = new Scanner(System.in); 
		double value1 = Double.NaN; 
		double value2 = Double.NaN; 
		double choice = Double.NaN; 
		System.out.println("Hello please input your numeric values to be calculated"); 
		do{
			try{
			System.out.print("\nValue 1(Must be numeric): "); 
		    value1 = k.nextDouble();
			}
			catch(InputMismatchException e){
				System.out.println("Not a valid number"); 
				k.nextLine(); 
			} 
		}while(Double.isNaN(value1));
		do{
			try{
		System.out.print("\nValue 2(Must be numeric): "); 
		value2 = k.nextDouble();
			}
			catch(InputMismatchException e){
				System.out.println("Not a valid number");
                k.nextLine();
			}
		}while(Double.isNaN(value2));  
		System.out.println("Value 1 is " + value1 + " and value 2 is " + value2); 
		AddMult obj;
		do{
			try{ 
		System.out.print("\nNow pick what type of calculation you need. Enter 1 to ADD your values. Enter 2 to MULTIPLY your values: "); 
		choice = k.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Not a valid number");
                k.nextLine();
			} 
		}while(Double.isNaN(choice)); 
		if(choice == 1){
			obj = new Add(); 
		}	
		else{
			obj = new Mult(); 
		}	
		obj.calc(value1, value2);  	
		k.close(); 
	}






}
