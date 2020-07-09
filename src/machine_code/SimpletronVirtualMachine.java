package machine_code;

import java.util.Scanner;

public class SimpletronVirtualMachine 
{
	public void load(int[] memory,Scanner scanner) 
	{
		int accumulator = 0;
		for(int instructionCounter = 0; instructionCounter < memory.length; instructionCounter++)
		{
			int operationCode = memory[instructionCounter]/100;
			int operand = memory[instructionCounter]%100;
			
			switch(operationCode)
			{
			case Constants.read:
				System.out.println("Enter Integer:");
				memory[operand] = scanner.nextInt();
				break;
			case Constants.write:
				System.out.println(memory[operand]);
				break;
				
			case Constants.load:
				accumulator = memory[operand];
				break;
			case Constants.store:
				memory[operand] = accumulator;
				break;
				
			case Constants.add:
				accumulator += memory[operand];
				break;
			case Constants.subtract:
				accumulator -= memory[operand];
				break;
			case Constants.multiply:
				accumulator *= memory[operand];
				break;
			case Constants.divide:
				accumulator /= memory[operand];
				break;
			case Constants.power:
				accumulator = (int) Math.pow((double) accumulator, (double) memory[operand]);
				break;
				
			case Constants.branch:
				instructionCounter = operand;
				break;
			case Constants.branch_neg:
				if(accumulator < 0)
					instructionCounter = operand;
				break;
			case Constants.branch_zero:
				if(accumulator == 0)
					instructionCounter = operand;
				break;
			case Constants.halt:
				System.out.println("code ends");
				instructionCounter = memory.length;
				break;
				
				default:
					throw new IllegalArgumentException();
			}
		}
	}
}
