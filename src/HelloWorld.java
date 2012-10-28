/*
 *  SCOTT SUMMERS
 *  FIRST LAB ASSIGNMENT
 */

 import java.io.*;

 class hello {
 // class data
 static private PrintWriter screen = new PrintWriter (System.out, true);
 static private BufferedReader keyboard = new BufferedReader(new InputStreamReader (System.in));

 static private double degF;
 static private double degC;
 // classs methods

 public static void main(String argv[]) throws IOException
  {
    screen.print("\nEnter A degree in F >");
    screen.flush();
    degF = new Double (keyboard.readLine()).doubleValue();

    //screen.print("\nEnter your age > ");
    //screen.flush();
    //age = new Integer (keyboard.readLine()) .intValue();

     degC = (((5.0/9.0)*degF)-(160.0/9.0));
      //return degC;

    screen.println("\n"+ degF + "Degrees F is " + degC + " Degrees C");
    //screen.println("\n " + name + " is " + age + " years old.");

    screen.print("\nPress Enter to terminate.");
    screen.flush();
    keyboard.readLine();
  }
}

