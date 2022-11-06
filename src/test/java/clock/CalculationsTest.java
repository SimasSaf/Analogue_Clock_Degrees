package clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest
{
    Calculations calc = new Calculations();

    //Some preliminary tests for the values:
    @Test
    void degreesBetweenArrows_Zero()
    {
        assertEquals(0, calc.degreesBetweenHourAndMinute(12, 0));
        assertEquals(0, calc.degreesBetweenHourAndMinute(12, 60));
    }

    @Test
    void degreesBetweenArrows_HalfCircles()
    {
        assertEquals(180, calc.degreesBetweenHourAndMinute(12, 30));
        assertEquals(180, calc.degreesBetweenHourAndMinute(3, 45));
        assertEquals(180, calc.degreesBetweenHourAndMinute(6, 0));
        assertEquals(180, calc.degreesBetweenHourAndMinute(9, 15));
    }

    @Test
    void degreesBetweenArrows_90()
    {
        assertEquals(90, calc.degreesBetweenHourAndMinute(12, 15));
        assertEquals(90, calc.degreesBetweenHourAndMinute(12, 45));
    }
}