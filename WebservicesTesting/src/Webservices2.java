import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.*;

public class Webservices2 {

public static void main(String[] args) {

try {

URL url = new URL("http://api.openweathermap.org/data/2.5/weather?id=2172797");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");
conn.setRequestProperty("Accept", "application/json");

if (conn.getResponseCode() != 200) {
throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
}

Scanner scan = new Scanner(url.openStream());
String str = new String();
while (scan.hasNext())
str += scan.nextLine();
scan.close();

System.out.println("str : " + str);

JSONObject obj = new JSONObject(str);
String coord_lon = obj.getJSONObject("coord").getString("lon");
String coord_lat = obj.getJSONObject("coord").getString("lat");
System.out.println("coord.lon" + coord_lon);
System.out.println("coord.lat" + coord_lat);

JSONArray arr = obj.getJSONArray("weather");
for (int i = 0; i < arr.length(); i++) {
//System.out.println(“coord.lat” + coord_lat);
String post_id = arr.getJSONObject(i).getString("description");

}

conn.disconnect();

} catch (MalformedURLException e) {

e.printStackTrace();

} catch (IOException e) {

e.printStackTrace();

}

}

}