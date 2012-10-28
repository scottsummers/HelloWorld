import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author scott
 *
 */
public class YourAge {
	
	 public void whatIsYourAge(PrintWriter screen, BufferedReader keyboard){
		 boolean exceptionloop = true;
		 do{
			 try {
				 
				 screen.print("\nEnter your name > "); screen.flush();
				 String name = new String (keyboard.readLine());
				 
				 screen.print("\nEnter your age > "); screen.flush();
				 int age = new Integer (keyboard.readLine()) .intValue();
				 
				 screen.println("\n " + name + " is " + age + " years old.");
				 exceptionloop = false;
				 
			 } catch (Exception e){
				 screen.println("Sorry somewhere along the line a bad value go inputed try again.");
				 exceptionloop = true;
			 }
		 } while(exceptionloop == true);
	 }
}
