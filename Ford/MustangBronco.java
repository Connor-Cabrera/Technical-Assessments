import java.util.*;

public class MustangBronco{
	
	public static int validateNumber(){
		Scanner scnr = new Scanner(System.in);
		boolean flag = false;
		int input = 0;
		
		while(!flag){
			System.out.print("Please Enter Your Integer: ");
			
			if(scnr.hasNextInt()){
				input = scnr.nextInt();
				flag = true;
				
			}
			else{
				System.out.println("Not an Integer. Try Again.\n");
				scnr.next();
			}
		}
		return input;
	}
	
	public static void output(int n){
		
		if((n % 3 == 0) && !(n % 5 == 0)){
			System.out.println("Mustang");
		}
		else if((n % 5 == 0) && !(n % 3 == 0)){
			System.out.println("Bronco");
		}
		else if((n % 3 == 0) && (n % 5 == 0)){
			System.out.println("MustangBronco");
		}
		else{
			System.out.println(n);
		}
		System.out.println();
	}
	
	public static boolean validateAnswer(){
		Scanner scnr = new Scanner(System.in);
		boolean flag = false;
		
		while(!flag){
			System.out.print("Would you like to run automated Tests? [y/n]: ");
			char answer = scnr.next().charAt(0);
			
			if(answer == 'y'){
				flag = true;
			}
			else if(answer == 'n'){
				System.out.println("Goodbye.");
				System.exit(0);
			}
			else{
				System.out.println("Invalid Input. Try Again.\n");
			}
		}
		return flag;
	}
	
	public static void test(int min, int max){
		int rand = 0;
		
		for(int i = 0; i < 10; i++){
			rand = (int)(Math.random() * (max - min + 1) + min);
			System.out.println("Testing: " + rand);
			output(rand);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int input = validateNumber();
		
		
		output(input);
		if(validateAnswer()){
			System.out.println("Please Enter Min and Max Integer Test Values");
			int min = validateNumber();
			int max = validateNumber();
			
			if(max < min){
				System.out.println("Your max was less than your min. Swapping numbers.\n");
				int temp = min;
				min = max;
				max = temp;
			}
			test(min, max);
		}
		
		
	}
}