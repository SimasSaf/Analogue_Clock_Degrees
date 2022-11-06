package clock;

public class Clock
{
    int minutes, hour;

    public Clock(){}

    public Clock(int hour, int minutes)
    {
        this.hour = hour;
        this.minutes = minutes;
    };

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes)
    {
        if (minutes > 60 || minutes < 0)
        {
            throw new IllegalArgumentException("Minutes must be between 0 and 60");
        }
        this.minutes = minutes;
    }

    public int getHour() { return hour; }

    public void setHour(int hour)
    {
        if (hour > 12 || hour < 1)
        {
            throw new IllegalArgumentException("Hour must be between 1 and 12");
        }
        this.hour = hour;
    }
}
