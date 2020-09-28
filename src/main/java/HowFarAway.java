import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        //Initializes the variables that I'm gonna use in this assignment
        double startingLatitude;
        double startingLongitude;
        double endLatitude;
        double endLongitude;

        //Creates a scanner that is used to interact with the user
        Scanner myScanner = new Scanner(System.in);

        //Prompts the user for his information
        System.out.println("Enter the latitude of the starting location: ");
        startingLatitude = myScanner.nextDouble();

        System.out.println("Enter the longitude of the starting location: ");
        startingLongitude = myScanner.nextDouble();

        System.out.println("Enter the latitude of the ending location: ");
        endLatitude = myScanner.nextDouble();

        System.out.println("Enter the longitude of the ending location: ");
        endLongitude = myScanner.nextDouble();

        //I refer back to the GeoLocation class to use its methods
        GeoLocation myGeolocation = new GeoLocation(startingLatitude, startingLongitude);
        GeoLocation myGeolocation2 = new GeoLocation(endLatitude, endLongitude);
        System.out.println("The distance is " + myGeolocation.distanceFrom(myGeolocation2) + " miles.");

    }
}