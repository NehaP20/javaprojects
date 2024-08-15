package JavaPractice;
import java.util.Arrays;
public class RevereseArray_practice 
{
	public static void main(String[] args) 
	{
		int[] a = {101, 202, 303};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++)  // Copy array 'a' to array 'b'
        {
            b[i] = a[i];
        }

        System.out.println("B array is - " + Arrays.toString(b));

        for (int j = b.length - 1; j >= 0; j--) // Print the elements of 'b' in reverse order
        {
            System.out.print(b[j]);
            if (j > 0) {
                System.out.print(", ");
            }
        }
	}
}

