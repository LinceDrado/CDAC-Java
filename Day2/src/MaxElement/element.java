package MaxElement;

public class element {
	public static void main(String[] args) 
	{
		int[] num = {1,10,3,4};
		
		int show = largest(num);
		System.out.print(show);
	}

	public static int largest(int[] num) 
	{
		// TODO Auto-generated method stub
		int max = num[0];
		for (int i = 0; i<num.length; i++) 
		{
			if (max<num[i]) 
			{
				max = num[i];
			}
		
		}
		return max;
	}
}
