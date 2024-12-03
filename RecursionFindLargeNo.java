import java.util.Scanner;

public class RecursionFindLargeNo {
    public static void main(String args[]) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter Array Size?\t");
        int size = xyz.nextInt();
        int a[] = new int[size];
        System.out.println("\nEnter Array Elements");
        for (int i = 0; i < size; i++) {
            a[i] = xyz.nextInt();
        }

        System.out.println("Largest No: " + findLargNo(a,a[0]));
    }
	static int i=0;
    public static int findLargNo(int m[], int larg) {
        if (i == m.length) {
            return larg; 
        }
        
        if (m[i] > larg) {
            larg = m[i]; 
        }
		i++;
        return findLargNo(m,larg); 
    }
}
