package scooters;

import scooters.Scooter;
import utils.Location;
import utils.HTTPRequests;

import java.util.Date;

import static utils.HTTPRequests.sendPostRequest;

public class SpinScooter extends Scooter {
    String authToken = "";

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

    public void getAuthToken(String email)
    {
        authToken = sendPostRequest("https://web.spin.pm/api/v1/magic_links", email);
    }
}
