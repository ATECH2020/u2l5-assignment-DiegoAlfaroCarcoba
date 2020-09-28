import java.util.Scanner;
public class ConstructionTester
{
    public static void main(String[] args)
    {
      //Initializes my variables that are gonna be used
      double taxRate;
      int numBoards;
      int numWindows;
      double lumberCost;
      double windowCost;
      double total;
      double grandTotal;

      //Creates a scanner in order to find out information from the user
      Scanner myScanner = new Scanner(System.in);

      //Prompts the user about their information, and gets the information
      System.out.println("Enter the sales tax rate: ");
      taxRate = myScanner.nextDouble();

      System.out.println("How many boards do you need?");
      numBoards = myScanner.nextInt();

      System.out.println("How many windows do you need?");
      numWindows = myScanner.nextInt();

      //I refer back to the Construction class in order to use its methods
      Construction myConstruction = new Construction(8.0, 11.0, taxRate);
      lumberCost = myConstruction.lumberCost(numBoards);
      windowCost = myConstruction.windowCost(numWindows);
      total = lumberCost + windowCost;
      System.out.println("Total: " + total);
      grandTotal = myConstruction.grandTotal(total);
      System.out.println("Grand Total: " + grandTotal);
    }
}
