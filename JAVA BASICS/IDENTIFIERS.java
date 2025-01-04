/** An identifier in Java is the name given to Variables, Classes, Methods, Packages, Interfaces, etc. 
 These are the unique names and every Java Variables must be identified with unique names. */

 public class IDENTIFIERS
{
    public static void main(String[] args)
    {
        int a = 20;
        System.out.println(" : " + a);
    }
}


// 5 identifiers
// IDENTIFIERS: Class Name
// main: Method Name
// String: Predefined Class Name
// args: Variable Name
// a: Variable Name


/*      

Rules For Naming Java Identifiers
There are certain rules for defining a valid Java identifier. These rules must be followed, otherwise, we get a compile-time error. 
These rules are also valid for other languages like C, and C++. 

The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore). 

For example “geek@” is not a valid Java identifier as it contains a ‘@’ a special character.

Identifiers should not start with digits([0-9]). For example “123geeks” is not a valid Java identifier.

Java identifiers are case-sensitive.

There is no limit on the length of the identifier but it is advisable to use an optimum length of 4 – 15 letters only.

Reserved Words can’t be used as an identifier. For example “int while = 20;” is an invalid statement as a while is a reserved word. 
There are 53 reserved words in Java.



     */


//Reserved Words in Java
/*

abstract	    continue	for	            protected	    transient
Assert	        Default	    Goto	        public	        Try
Boolean	        Do	        If	            Static	        throws
break	        double	    implements	    strictfp	    Package
byte	        else	    import	        super	        Private
case	        enum	    Interface	    Short	        switch
Catch	        Extends	    instanceof	    return	        void
Char	        Final	    Int	            synchronized	volatile
class	        finally	    long	throw	Date
const	        float	    Native	This	while

*/