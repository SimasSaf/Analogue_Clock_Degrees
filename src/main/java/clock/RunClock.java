package clock;

import java.util.InputMismatchException;
import java.util.Scanner;

//For the inputs did some black box testing
public class RunClock
{
    //initialize
    static Clock clock = new Clock(0, 0);
    static ICalculations calc = new Calculations();
    static Scanner userInput = new Scanner(System.in);
    static int hour, minutes;

    public static void RunClock()
    {
        while(true)
        {
            System.out.print("Please provide the hour: ");
            takeAndValidateHour();

            System.out.print("Please provide the minute: ");
            takeAndValidateMinutes();

            System.out.println("Degrees between the two arrows: " + calc.degreesBetweenHourAndMinute(clock.getHour(), clock.getMinutes()));

        }

    }

    private static void takeAndValidateHour()
    {
        while(true)
        {
            try
            {
                hour = userInput.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("-Input has to be a number-");
                userInput.nextLine();
            }

            if (hour > 12 || hour < 1)
            {
                System.out.println("-Please enter a value between 1 and 12-");
            }
            else
            {
                clock.setHour(hour);
                break;
            }
        }
    }

    private static void takeAndValidateMinutes()
    {
        while(true)
        {
            try
            {
                minutes = userInput.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("-Input has to be a number-");
                userInput.nextLine();
            }

            if (minutes > 60 || minutes < 0)
            {
                System.out.println("-Please enter a value between 0 and 60-");
            }
            else
            {
                clock.setMinutes(minutes);
                break;
            }
        }
    }
}

