package my.nvinz.rest1;

import org.json.simple.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;

@CrossOrigin(maxAge = 3600)
@RestController
public class Rest1RestController {

    private Data data = new Data();

    @RequestMapping(value = "/getData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Data getData() {
        return data;
    }

    @RequestMapping(value = "/getData", method = RequestMethod.POST/*, consumes = MediaType.TEXT_PLAIN_VALUE*/)
    public void setData(@RequestBody Data data) {
        this.data.setData(data);

        JSONObject jsonData = new JSONObject();
        jsonData.put("latitude", data.getLatitude());
        jsonData.put("longtitude", data.getLongtitude());

        try {
            FileWriter file = new FileWriter("data.json");
            file.write(jsonData.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
