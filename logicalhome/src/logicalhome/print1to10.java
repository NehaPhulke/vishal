package logicalhome;

public class print1to10 {

	public static void print(int num)
	{
		if(num<=10)
		{ 
		System.out.println(num);
		num++;
		print(num);
		}
		System.out.println("neha");
	}
	
	public static void main(String[]args)
	{
		print(1);
	}
}
