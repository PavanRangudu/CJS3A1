
public class CJS3A1_testing_code {
	static {
		print(10);
	}
	public static void print(int x){
		System.out.println(x);
		System.exit(0);
	}
}
/* Output :
 
 RunTime Error: Main method not found in class CJS3A1_testing_code, please define the main method as:
	   public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application 
	
	Note : Before Java 7, we can run java class by using static initializers. 
	But, from Java 7 it is not possible, public static void main(String[] args) is a must.

*/