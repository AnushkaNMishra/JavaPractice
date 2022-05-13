import java.util.*;

public class MergeTwoArrays {
	public static void main(String[] args)
	{
		int a[] = { 54, 27, 52, 65};
		int b[] = {44, 70, 12, 98, 36, 75};

		int a1 = a.length;
		int b1 = b.length;
    int c1 = a1 + b1;
		int[] c = new int[c1];

		for (int i = 0; i < a1; i = i + 1) 
    {
			c[i] = a[i];
		}
		for (int i = 0; i < b1; i = i + 1) 
    {
			c[a1 + i] = b[i];
		}
		for (int i = 0; i < c1; i = i + 1) {
			System.out.println(c[i]);
		}
	}
}
