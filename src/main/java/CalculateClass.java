import java.util.Scanner;

public class CalculateClass {
    public void calculate(int a, int b){
        System.out.println("Enter a number for A:");
        Scanner aValue = new Scanner(System.in);
        System.out.println("Enter a number for B:");
        Scanner bValue = new Scanner(System.in);
         a = aValue.nextInt();
         b = bValue.nextInt();
    }
}
