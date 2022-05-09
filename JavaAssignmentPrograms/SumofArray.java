package JavaAssignmentPrograms;

public class SumofArray {
	public static void main(String[] args) {
		
	int a[][] = {{1,2,3,4},
		     {5,6,7,8},
		     {9,10,11,12}
           };
	int sum=0,r=3,c=4;
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
   sum= sum+a[i][j];
	}	
System.out.println(sum);
	
}
}

