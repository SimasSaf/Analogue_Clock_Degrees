package clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest
{
    Clock clock;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        clock = new Clock(0, 0);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown()
    {
        clock = null;
    }

    //Hours:

    @Test
    void setGetHour_LowerBound()
    {
        clock.setHour(1);
        assertEquals(1, clock.getHour());
    }

    @Test
    void setGetHour_UpperBound()
    {
        clock.setHour(12);
        assertEquals(12, clock.getHour());
    }

    @Test
    void setGetHour_Middle()
    {
        clock.setHour(6);
        assertEquals(6, clock.getHour());
    }

    @Test
    void setHour_BelowLimit()
    {
        assertThrowsExactly(IllegalArgumentException.class, () -> {clock.setHour(-1);});
    }

    @Test
    void setHour_OverLimit()
    {
        assertThrowsExactly(IllegalArgumentException.class, () -> {clock.setHour(13);});
    }

    //Minutes:

    @Test
    void setGetMinutes_LowerBound()
    {
        clock.setMinutes(0);
        assertEquals(0, clock.getMinutes());
    }

    @Test
    void setGetMinutes_UpperBound()
    {
        clock.setMinutes(60);
        assertEquals(60, clock.getMinutes());
    }

    @Test
    void setGetMinutes_Middle()
    {
        clock.setMinutes(30);
        assertEquals(30, clock.getMinutes());
    }

    @Test
    void setMinutes_BelowLimit()
    {
        assertThrowsExactly(IllegalArgumentException.class, () -> {clock.setMinutes(-1);});
    }

    @Test
    void setMinutes_OverLimit()
    {
        assertThrowsExactly(IllegalArgumentException.class, () -> {clock.setMinutes(61);});
    }
}