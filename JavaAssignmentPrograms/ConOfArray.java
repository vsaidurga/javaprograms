package JavaAssignmentPrograms;

import java.util.Arrays;

public class ConOfArray {
  public static void main(String[] args) {
	  int [] a = {1,2,3,4,5};
	  int [] b = {6,7,8,9,10};
	  int lena = a.length;
	  int lenb = b.length;
	  int[] concate = new int[lena+lenb];
	  System.arraycopy(a, 0, concate, 0, lena);
	  System.arraycopy(b, 0, concate, lena, lenb);
	  System.out.println(Arrays.toString(concate));
  }
}
