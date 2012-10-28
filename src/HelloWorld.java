/*
 *  SCOTT SUMMERS
 *  FIRST LAB ASSIGNMENT
 */

import java.io.*;

class hello {
 // class data
 static private PrintWriter screen = new PrintWriter (System.out, true);
 static private BufferedReader keyboard = new BufferedReader(new InputStreamReader (System.in));

 // classs methods
 
 public void helloWorld(){
	 screen.println("Hello World!");	 
 }
 
  public static void main(String argv[]) throws IOException
  {
	 //Kick it off from here.
	 Menu mu = new Menu();
	 mu.menu(screen, keyboard);
	 screen.println("\nGood Bye!");
  }
}

