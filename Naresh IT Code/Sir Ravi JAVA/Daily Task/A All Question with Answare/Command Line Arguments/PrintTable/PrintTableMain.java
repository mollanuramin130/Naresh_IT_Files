class PrintTable{
	public static void printTable(int number){
	if(number>0){
		for(int i=1;i<=10;i++){
			System.out.println(number + " X "+i+" = "+(number*i));
		}
	}else{
		System.out.print("Enter any Positive number...");
	}
		
	}
}

public class PrintTableMain{
	public static void main(String args[]){
		int number = Integer.parseInt(args[0]);
		PrintTable.printTable(number);
	}
}