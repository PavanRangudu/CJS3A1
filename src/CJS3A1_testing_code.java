
public class CJS3A1_testing_code {
	static {
		print(10);
	}
	public static void print(int x){
		System.out.println(x);
		System.exit(0);
	}
}
/* Output : a) Compile time error
 
 Error: Main method not found in class CJS3A1_testing_code, please define the main method as:
	   public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application 

*/