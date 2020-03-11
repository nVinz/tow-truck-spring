package my.nvinz.rest1;

public class Data {
    private String latitude;
    private String longtitude;

    public Data() {
        this.latitude = "55.675273";
        this.longtitude = "37.857642";
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
