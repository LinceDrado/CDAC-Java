package DigitReverseHW;


public class Digits {
	public static void main(String[] args) {


				
		int[] num = {1,2,3,4};
		
		revArray(num);
		
	}

	public static void revArray(int[] num) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = num.length - 1;
		
		while (i < j)
		{
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			i++;
			j--;
		}
		for (int show : num) {
			System.out.print(show + " ");
		}
	}
}
