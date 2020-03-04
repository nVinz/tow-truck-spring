package my.nvinz.rest1;

public class DataController {

    public class Data {
        private String latitude;
        private String longtitude;

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
    }

    private Data data;

    public DataController() {
        data = new Data();
    }

    public Data getData() {
        return data;
    }

    public void setData(String latitude, String longtitude) {
        data.setLatitude(latitude);
        data.setLongtitude(longtitude);
    }

    public void setData(Data data) {
        this.data = data;
    }
}
