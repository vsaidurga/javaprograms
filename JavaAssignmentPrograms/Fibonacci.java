package JavaAssignmentPrograms;

public class Fibonacci {
public static void main(String[] args) {
	int n = 10,a=0,b=1,c;
	System.out.println(a+" \n"+b);//0
	
	for(int i=0;i<n;i++)
	{
		c=a+b;//1+0
		System.out.println(c);
		a=b;
		b=c;
	}
}
}
