package JavaAssignmentPrograms;

public class ZeroToSide {
public static void main(String[] args) {
	int[] a = {1,0,2,0,3,0,4,0};
	int cut=0;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			a[cut] = a[i];
			cut++;
		}
	}
	while(cut<a.length) {
		a[cut]=0;
		cut++;
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+ " ");
	}
}
}
