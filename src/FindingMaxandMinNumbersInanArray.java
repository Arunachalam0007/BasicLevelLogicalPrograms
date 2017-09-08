import java.util.ArrayList;
import java.util.List;

public class FindingMaxandMinNumbersInanArray {
	
	
	public static void findMax(int a[])
	{
	
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("finding max in Array"+max);
	}
	
	public static void findMin(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("findind min in Array"+min);
	}
	
	public static void findMaxArrayList(int a[])
	{
		List<Integer> al=new ArrayList<Integer>();
		for(int aa:a)
		{
			al.add(aa);
		}
		System.out.println(al);
		
		int max=al.get(0);
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)>max)
			{
				max=al.get(i);
			}
		}	
		System.out.println("finding max in ArrayList is: "+max);
		
	}
	
	public static void findMinArrayList(int a[])
	{
		List<Integer> al=new ArrayList<Integer>();
		for(int aa:a)
		{
			al.add(aa);
		}
		System.out.println(al);
		int min=al.get(0);
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)<min)
			{
				min=al.get(i);
			}
			
		}
		System.out.println("finding min in ArrayList is: "+min);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={15,3,2,5,16,7,4,12,1};
		findMax(a);
		findMin(a);
		findMaxArrayList(a);
		findMinArrayList(a);
	}

}
