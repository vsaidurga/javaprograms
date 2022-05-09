package JavaAssignmentPrograms;

public class Largesteleofarray {

	public static void main(String[] args) {
		int [] a= new int[] {10,30,100,90,20};
		int max = a[0];
		for(int i =0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
}
