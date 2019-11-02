import java.util.Date;

public abstract class Scooter {
    private Location location;
    private double batteryPercentage;
    private Date lastAccessed;

    abstract Location getLocation();
    abstract double getBatteryPercentage();
    abstract Date getLastAccessed();

    public void setLocation(Location location)
    {
        this.location = location;
    }

    public void setBatteryPercentage(double batteryPercentage)
    {
        this.batteryPercentage = batteryPercentage;
    }

    public void setLastAccessed(Date lastAccessed)
    {
        this.lastAccessed = lastAccessed;
    }
}
