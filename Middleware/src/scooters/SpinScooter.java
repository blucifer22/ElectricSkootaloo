package scooters;

import scooters.Scooter;
import utils.Location;


import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Date;


public class SpinScooter extends Scooter {
    private String authToken = "";
    private String jwt = "";

    public SpinScooter()
    {
        getAuthToken("msc68@duke.edu");
    }

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
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest authTokenRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://web.spin.pm/api/v1/magic_links"))
                .timeout(Duration.ofMinutes(1))
                .POST(HttpRequest.BodyPublishers.ofString("{\"email\": \"msc68@duke.edu\"}")).build();
        try {
            HttpResponse<?> response = client.send(authTokenRequest, HttpResponse.BodyHandlers.discarding());
            System.out.println(response.statusCode());
        }
        catch(Exception e)
        {
            System.out.println("Something is broken Marc you dumb ho");
        }
    }

    public void getJwt(String email, String authToken)
    {

    }

    public static void main(String[] args) {
        SpinScooter spinnyBoi = new SpinScooter();
        spinnyBoi.getAuthToken("msc68@duke.edu");
    }
}
