import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//Task 1
        double temp = 0;
        String validTemp = "n";
        Scanner in = new Scanner(System.in);

      do
          {
             temp = 0;
              System.out.println("Enter temperature in Celsius: ");
              if (in.hasNextDouble())
              {
                  validTemp = "y";
                  temp = in.nextDouble();
              }
              else
              {
                  System.out.println("Please enter temperature in Celsius [XX.XX]");
                  validTemp = "n";
                  in.nextLine();
              }
          }
      while ((validTemp.equals("n")));

       temp = (temp * 1.8) + 32;
       if (temp >= 100)
       {
           System.out.println("Temperature is boiling at " + temp + " Fahrenheit");
       } else if (temp <= 0)
       {
           System.out.println("Temperature is freezing at " + temp + " Fahrenheit");
       }
       else
       {
           System.out.println("Temperature in Fahrenheit is " + temp);
       }
// Task 2
        double tankGallons = 0;
       double fuelEff = 0;
       double pPerG = 0;
       String validGas = "y";
       String validEff = "y";
       String validPG = "y";
       double toltalRange = 0;
       double toltalCost = 0;

        do
        {
            tankGallons = 0;
            System.out.println("Enter the number of gallons of gas in tank: ");
            if (in.hasNextDouble())
            {
                validGas = "y";
                tankGallons = in.nextDouble();
            }
            else
            {
                System.out.println("Invalid input! ");
                validGas = "n";
                in.nextLine();
            }
        }
        while ((validGas.equals("n")));

        do
        {
            fuelEff = 0;
            System.out.println("Enter car's fuel efficiency: ");
            if (in.hasNextDouble())
            {
                validEff = "y";
                fuelEff = in.nextDouble();
            }
            else
            {
                System.out.println("Invalid input!" );
                validEff = "n";
                in.nextLine();
            }
        }
        while ((validEff.equals("n")));

        do
        {
            pPerG = 0;
            System.out.println("Enter Price of gas per gallon: ");
            if (in.hasNextDouble())
            {
                validPG = "y";
                pPerG = in.nextDouble();
            }
            else
            {
                System.out.println("Invalid input");
                validPG = "n";
                in.nextLine();
            }
        }
        while ((validPG.equals("n")));

        toltalCost = (tankGallons / fuelEff) * pPerG;
        toltalRange = tankGallons * fuelEff;

        System.out.println("The toltal cost per 100 miles is $" + toltalCost + " , and the total distance that can be travelled with " + tankGallons +
                " gallons is " + toltalRange + " miles.");

        //task 3
        double length = 0;
        double width = 0;
        String validW = "y";
        String validL = "y";

        do
        {
            System.out.println("Enter the length: ");
            if (in.hasNextDouble())
            {
                validL = "y";
                length = in.nextDouble();
            }
            else
            {
                System.out.println("Invalid input! ");
                validL = "n";
                in.nextLine();
            }
        }
        while ((validL.equals("n")));
        do
        {
            System.out.println("Enter the width: ");
            if (in.hasNextDouble())
            {
                validW = "y";
                width = in.nextDouble();
            }
            else
            {
                System.out.println("Invalid input! ");
                validW = "n";
                in.nextLine();
            }
        }
        while ((validW.equals("n")));
        double perimiter = length + width + length + width;
        double area = length * width;
        double pyth = (length * length) + (width * width);

        System.out.println("Perimeter is: " + perimiter);
        System.out.println("Area is: " +area);
        System.out.println("Length of horizontal is: " + pyth);
//task 4
        double meter = 0;
        String validMeters = "y";

        do
        {
            System.out.println("Enter meters: ");
            if (in.hasNextDouble())
            {
                validMeters = "y";
                meter = in.nextDouble();
            }
            else
            {
                System.out.println("Invalid input! ");
                validMeters = "n";
                in.nextLine();
            }
        }
        while ((validMeters.equals("n")));

        double miles = meter / 1609.344;
        double feet = 3.28084 * meter;
        double inches = meter * 39.3701;

        System.out.println(meter + " meters is " + inches + " inches, " + feet + " feet, and " + miles + " miles." );






    }
}