Wipro TalentNext PBL

Topics Covered

Hands-on Assignments for Exception Handling



No. 	Hands-on Assignment 	Topics Covered 	Status

1 	

 Handle exception in number
Problem statement: 
Get the input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output). 
Sample input and output 1: 
Enter an integer: 12
The square value is 144
The work has been done successfully
Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.

	Exception Handling 	

2 	

 Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index.
 This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown.
Sample Input and Output 1:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
2
The array element at index 2 = 4
The array element successfully accessed

 Sample Input and Output 2:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
6
java.lang.ArrayIndexOutOfBoundsException

	Exception Handling: Try-catch 	

3 	

Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero. 

 This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .  Use exception handling mechanisms to handle this exception. 

Sample Input and Output 1:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
1
The array element at index 1 = 80
The array element successfully accessed


 Sample Input and Output 2:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
9
java.lang.ArrayIndexOutOfBoundsException


 Sample Input and Output 3:
Enter the number of elements in the array
2
Enter the elements in the array
30
j
java.lang.NumberFormatException


	Exception Handling: Try-catch Use multiple catch block 	

4 	

 Write a class MathOperation which accepts integers from command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements. 
Display the result. 
Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
For example: The class would be invoked as follows: 
C:>java MathOperation 1900, 4560, 0, 32500

	Exception handling: throws 	

5 	

 Write a Program with a division method who receives two integer numbers and performs the division operation. The method should declare that it throws ArithmeticException. This exception should be handled in the main method.

	throws 	

6 	

 Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)

	Exception Handling: Throw & Used Defined Exception 	

7 	

 
A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
registerUser– The parameter are String username,String userCountry and add the following logic,
• if userCountry is not equal to  “India” throw a InvalidCountryException with the message “User Outside India  cannot be registered”
• if userCountry is equal to  “India”,  print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves,
Name Country Expected Output
Mickey US InvalidCountryException should be thrown.
 The message should be “User Outside India  cannot be registered”
Mini India The message should be “User registration done successfully”
Sample Input and Output

	Exception Handling: User Defined Exception & throw 	

8 	

 
Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 
The program must exit gracefully after displaying the error message in case the arguments passed are not proper. (Hint : Create a user defined exception class for handling errors.)

	Exception handling: User Defined Exception & throw 	

9 	

 Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.
Sample Input and Output 1:
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block
Sample Input and Output 2:
Enter the 2 numbers
5
0
DivideByZeroException caught
Inside finally block

	Exception Handling: Finally block 	