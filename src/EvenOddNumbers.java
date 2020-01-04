import java.util.ArrayList;

public class EvenOddNumbers {

	public static void main(String[] args) {

		int[] a = { 8, 5, 10, 12, 3, 1, 4 };

		ArrayList<Integer> al1 = new ArrayList<>();
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else
			{
				al2.add(a[i]);
			}
		}
		System.out.println("even no's are");
		for(int no:al1)
		{
			System.out.println(no+" ");
		}
		System.out.println();
		
		System.out.println("total no of even no's are: "+al1.size());
		System.out.println();
		
		System.out.println("odd no's are");
		for(int no:al2)
		{
			System.out.println(no+" ");
		}	
			System.out.println(" total no of odd no's are:"+al2.size());
		}
	}











