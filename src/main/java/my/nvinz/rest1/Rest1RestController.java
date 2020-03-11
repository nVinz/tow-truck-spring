package my.nvinz.rest1;

import org.json.simple.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
    }
}
