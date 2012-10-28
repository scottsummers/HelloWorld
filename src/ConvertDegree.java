import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author scott
 *
 */
public class ConvertDegree {

	 public void degreeFtoDegreeC(PrintWriter screen, BufferedReader keyboard){
		 try {
			 
			 screen.print("\nEnter A degree in F >"); screen.flush();
			 double degreeF = new Double (keyboard.readLine()).doubleValue();
			 double degreeC = (((5.0/9.0)*degreeF)-(160.0/9.0));
			 
			 
			 screen.println("\n"+ degreeF + " Degrees Fahrenheit equals " + degreeC + " Degrees Celsius");
		 } catch (Exception e) {
			 screen.println("Sorry that was invalid.");
		 }
	 }
}
