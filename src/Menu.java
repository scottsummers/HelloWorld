import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 * 
 */

/**
 * @author scott
 *
 */

public class Menu {	
	
	private void waitForUser(PrintWriter screen, BufferedReader keyboard){
		 screen.print("Enter to Continue > "); screen.flush();
		 try {
			 keyboard.readLine();
		 } catch (Exception e) {
			 screen.println(e);
		 }
	}
	
	 public void menu(PrintWriter screen, BufferedReader keyboard){
		 boolean menuloop = true;
		 do {
			 screen.println("Welcome to Scott's run away HelloWorld Program");
			 screen.print  ("***********************************************\n" +
			 		        "*  Select and option:                         *\n" +
			 		        "*  1. HelloWorld                              *\n" + 
			 		        "*  2. Name and Age                            *\n" +
			 		        "*  3. Degree Fahrenheit to Celsius            *\n" +
			 		        "*  0. To Exit                                 *\n" +
			 		        "***********************************************\n" +
			 		        "Enter a Number > "); screen.flush();
		     try{
		    	 int menuOption = new Integer(keyboard.readLine()).intValue();
		    	 switch (menuOption) {
		    	 	case 0:
		    	 		menuloop = false;
		    	 		break;
		    	 	case 1:
		    	 		HelloWorld hw = new HelloWorld();
		    	 		hw.helloWorld(screen);
		    	 		waitForUser(screen,keyboard);
		    	 		break;
		    	 	case 2:
		    	 		YourAge ya = new YourAge();
		    	 		ya.whatIsYourAge(screen, keyboard);
		    	 		waitForUser(screen,keyboard);
		    	 		break;
		    	 	case 3:
		    	 		ConvertDegree cd = new ConvertDegree();
		    	 		cd.degreeFtoDegreeC(screen, keyboard);
		    	 		waitForUser(screen,keyboard);
		    	 		break;
		    		 default:
		    			 screen.println("That's not an option.");
		    			 menuloop = true;
		    			 break;
		    	 }
		    		 
		     } catch (Exception e){
		    	 menuloop = true;
		    	 screen.println("Sorry that value is not an option.");
		    	 screen.println("\f");
		     }
		 } while(menuloop == true);
	 }
}
