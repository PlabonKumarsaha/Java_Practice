package com.intellier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
	// write your code here
        String type = "{\"temperature\":";

        Random rand = new Random();

        //URL obj = new URL("http://172.17.0.1:8080/api/v1/QsnZZtQfol3bNRCFhucJ/telemetry --header");
        URL obj = new URL("https://reqres.in/");

        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");
        //postConnection.setRequestProperty("userId", "a1bcdefgh");
        postConnection.setRequestProperty("Content-Type", "application/json");

        postConnection.setDoOutput(true);
        OutputStream os = postConnection.getOutputStream();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                try {

                    String data  = type + String.valueOf(rand.nextInt(100)) + "}";
                    System.out.println("sent data :  "+ data);
                    os.write(data.getBytes());
                    os.flush();
                    os.close();
                    int responseCode = postConnection.getResponseCode();
                    System.out.println("POST Response Code :  " + responseCode);
                    System.out.println("POST Response Message : " + postConnection.getResponseMessage());

                    if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
                        BufferedReader in = new BufferedReader(new InputStreamReader(
                                postConnection.getInputStream()));
                        String inputLine;
                        StringBuffer response = new StringBuffer();

                        while ((inputLine = in .readLine()) != null) {
                            response.append(inputLine);
                        } in .close();

                        System.out.println(response.toString());
                    } else {
                        System.out.println("POST NOT WORKED");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        },0,1000);







    }
}
