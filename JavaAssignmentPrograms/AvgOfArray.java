package JavaAssignmentPrograms;

public class AvgOfArray {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12},l=arr.length,sum=0;
		for(int i=0;i<l;i++)
		{
			sum=sum+arr[i];
	    }
		System.out.println("The sum of the array is "+sum );
	double avg = sum/l;
	System.out.println("The average is " +avg);
}
}
