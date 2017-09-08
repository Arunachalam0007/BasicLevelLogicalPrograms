import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingTheDuplicatesInArray {
	
	public static void CheckDupBruteForceMethod(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		System.out.println();

	}
	
	
	public static void SortingMethod(int a[])
	{
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
			System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void HashsetMethodTechnique(int a[])
	{
		Set<Integer> hs=new HashSet<>();
		for(int GivenArray:a)
		{
			if(hs.add(GivenArray)==false)
			{
				System.out.print(GivenArray+" ");
			}
		}
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,1,3,5,6,4,2,3,7,8,4};
		CheckDupBruteForceMethod(a);
		SortingMethod(a);
		HashsetMethodTechnique(a);
	}

}
