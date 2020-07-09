package machine_code;

import java.util.Scanner;

public class Constants 
{
	// Variable functions
	public static final int read = 10;
	public static final int write = 11;
	
	// Load/Store operations
	public static final int load = 20;
	public static final int store = 21;
	
	// Arithematic operations
	public static final int add = 30;
	public static final int subtract = 31;
	public static final int multiply = 32;
	public static final int divide = 33;
	public static final int power = 34;
	
	// Transfer of control
	public static final int branch = 40;
	public static final int branch_neg = 41;
	public static final int branch_zero = 42;
	public static final int halt = 43;
	
	// Memory Array
	public static int[] memory = new int[100];
	
	// Scanner item
	public static Scanner scanner = new Scanner(System.in);
	
}
