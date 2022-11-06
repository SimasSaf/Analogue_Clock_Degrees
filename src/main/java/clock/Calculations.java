package clock;

public class Calculations implements ICalculations
{

    //These values are global just in case the clock parameters
    //for whatever reason would be changed
    int totalCircleDegrees = 360;
    int totalMinutes = 60;
    int totalHours = 12;


    public int degreesBetweenHourAndMinute(int hour, int minute)
    {
        int degreeDifference = hourDegree(hour) - minuteDegree(minute);

        if (degreeDifference > totalCircleDegrees/2)
        {
            degreeDifference -= 360;
        }

        if (degreeDifference < 0) {degreeDifference *= -1;}

        return degreeDifference;
    }

        private int hourDegree ( int hour)
        {
            return hour * totalDegreesInAClockByHour();
        }

        private int minuteDegree ( int minute)
        {
            return minute * totalDegreesInAClockByMinute();
        }

        private int totalDegreesInAClockByMinute ()
        {
            return totalCircleDegrees / totalMinutes;
        }

        private int totalDegreesInAClockByHour ()
        {
            return totalCircleDegrees / totalHours;
        }
}
