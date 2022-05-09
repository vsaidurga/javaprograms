package JavaAssignmentPrograms;

import java.util.Scanner;

public class GivenValue {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		boolean search1=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search:");
		int search = sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==search) {
				search1 =true;
				break;
				}
		}

				if(search1)
				System.out.println(search+ " contained in array");
		
			else 
				System.out.println(search+ " not contained in array");
		
		}
	}


		
	
