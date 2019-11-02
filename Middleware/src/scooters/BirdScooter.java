package scooters;

import utils.Location;

import java.util.Date;

public class BirdScooter extends Scooter {
    @Override
    Location getLocation() {
        return null;
    }

    @Override
    double getBatteryPercentage() {
        return 0;
    }

    @Override
    Date getLastAccessed() {
        return null;
    }
}
