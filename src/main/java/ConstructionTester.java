import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      double taxRate;
      int boards;
      int numWindows;

      Scanner myScanner = new Scanner(System.in);
      Construction myConstruction = new Construction();

      System.out.print("Enter the sales tax rate: ");
      taxRate = myScanner.nextDouble();

      System.out.println("How many boards do you need?");
      boards = myScanner.nextInt();

      System.out.println("How many windows do you need?");
      numWindows = myScanner.nextInt();

      Construction myConstruction = new Construction();
    }
}
