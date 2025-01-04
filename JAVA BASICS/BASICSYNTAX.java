/*   

        -    The name of the class defined by the program is HelloWorld, which is the same as the name of the file(HelloWorld.java). 
             This is not a coincidence. In Java, all codes must reside inside a class, and there is at most one public class which contains the main() method. 

        -   By convention, the name of the main class(a class that contains the main method) should match the name of the file that holds the program. 

        -   Every Java program must have a class definition that matches the filename (class name and file name should be same). 

   */

public class BASICSYNTAX {    // BASICSYNTAX is an identifier the name of the class or identifie the class
  
    
    public static void main(String args[]) // main()  : Name configured in the JVM. The main method must be inside the class definition. The compiler executes the codes starting always from the main function. 
                                          // public : So that  JVM  can execute the method from anywhere.
                                          // static  : The main method is to be called without an object. 
                                          //void  : The main method doesn’t return anything. 
                                          //String[]  : The main method accepts a single argument, i.e., an array of elements of type String. 
    {
      
          // Output is accomplished by the built-in println( ) method
        System.out.println("Hello World");
    }
}


// How to run the code , you must compile the code before you run it

// go to the directory where the file – BASICSYNTAX.java is present or cd BASICSYNTAX in cmd.

//Compile it by typing =  javac BASICSYNTAX.java
//Execute (or run) it by typing = java BASICSYNTAX //specifying the name of the class file on the command line