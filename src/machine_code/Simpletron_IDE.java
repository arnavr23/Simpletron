package machine_code;

import static machine_code.Constants.memory;
import static machine_code.Constants.scanner;

public class Simpletron_IDE 
{
public static void main(String[] args)
{
	print("*** Welcome to Simpletron! ***");
	print("*** Please enter your your program one instruction ***\n*** (or data word) at a time.I will display ***");
	print("*** the location number and a question mark(?). ***");
	print("*** Type -9999 to stop entering your program");
	print("");
	
	for(int x = 0; x < memory.length;x++ )
	{
		print(x+" ?");
		memory[x] = scanner.nextInt();
		int temp = memory[x];
		
		if(temp == -9999)
		{
			break;
		}
		
	}
	
	print("*** Program loading completed. *** \n*** program execution begins ***");
	
	SimpletronVirtualMachine svm = new SimpletronVirtualMachine();
	try {
	svm.load(memory,scanner);
	}
	catch(IllegalArgumentException e) {
		System.out.println("Syntax error!");
	}
	scanner.close();
}

public static void print(String x)
{
	System.out.println(x);
}
}
