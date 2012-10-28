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
 
 private static void helloWorld(){
	 screen.println("Hello World!");
 }

 private static void degreeFtoDegreeC(){
	 screen.print("\nEnter A degree in F >"); screen.flush();
	 try {
		 double degreeF = new Double (keyboard.readLine()).doubleValue();
		 double degreeC = (((5.0/9.0)*degreeF)-(160.0/9.0));
		 screen.println("\n"+ degreeF + " Degrees F equals " + degreeC + " Degrees C");
	 } catch (Exception e) {
		 screen.println("Sorry that was invalid.");
	 }
 }
 
 private static void whatIsYourAge(){
	 boolean exceptionloop = true;
	 while(exceptionloop == true){
		 try {
			 screen.print("\nEnter your name > ");
			 screen.flush();
			 String name = new String (keyboard.readLine());
			 screen.print("\nEnter your age > ");
			 screen.flush();
			 int age = new Integer (keyboard.readLine()) .intValue();
			 screen.println("\n " + name + " is " + age + " years old.");
			 exceptionloop = false;
		 } catch (Exception e){
			 screen.println("Sorry somewhere along the line a bad value go inputed try again.");
			 exceptionloop = true;
		 }
	 }
 }
 
 
 public static void main(String argv[]) throws IOException
  {
	helloWorld();
    degreeFtoDegreeC();
    whatIsYourAge();
    

    screen.print("\nPress Enter to terminate.");
    screen.flush();
    keyboard.readLine();
  }
}

