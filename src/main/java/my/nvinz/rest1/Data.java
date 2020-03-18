package my.nvinz.rest1;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

public class Data {
    private String latitude;
    private String longtitude;

    public Data() {
        try {
            FileReader reader = new FileReader(new File("data.json"));
            JSONObject jsonData = (JSONObject) new JSONParser().parse(reader);
            this.latitude = (String) jsonData.get("latitude");
            this.longtitude = (String) jsonData.get("longtitude");
        } catch (Exception e) {
            this.latitude = "55.675273";
            this.longtitude = "37.857642";
            System.out.println("[ERROR]: Location file does not exist!");
        }
    }

    public Data(String latitude, String longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public void setData(String latitude, String longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public void setData(Data data) {
        this.latitude = data.getLatitude();
        this.longtitude = data.getLongtitude();
    }
}
