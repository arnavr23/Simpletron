# About the project
this is a project that executes binary code, in the syntax simpletron.
you start the application and start writing code with the instuctions given below:

+ you enter a 4 digit code every line where the first 2 number specify the operation you want to perform: for e.g. add, subtract, read, load , etc.
+ the last 2 digit means the location you want to do the specified operation. the memory of the comuter is an array of 100
elements starting from 0, 1 .... 99. for e.g if you want to read from a address of 99 in the array, or to write a no. given by the user into address 98, etc.

*Note:* you have to load a number into memory when performing arithematic functions.

+ here is a list of operations followed by their code

 read = 10

 print = 11
	
	 Load/Store operations

 load = 20

 store = 21
	
	 Arithematic operations
 add = 30

 subtract = 31

 multiply = 32

 divide = 33

 power = 34
	
	 Transfer of control
 branch = 40

 branch neg = 41 ()

 branch zero = 42

 + enter -9999 as last line to stop writing code and start executing it.

 ## sample code: adding 2 no.

 + 1099: storing A

 + 1098: storing B
 
 + 2099: loading A into computer memory(ram)
 
 + 3098: adding B into computer memory(ram)
 
 + 2197: storing the result into array location 97
 
 + 1197: printing result to user
 
 + -9999 exiting

 *note* you cannot print string, only stored results.
 
