import java.util.Scanner;
public class Assignment1{
    
    public static void main(String[] args) {
      
        int n=5;
        String temp;
       
        String a[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i].compareTo(a[j])>0) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("a in Sorted Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        
    }
}
