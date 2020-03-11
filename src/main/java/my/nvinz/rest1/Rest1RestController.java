package my.nvinz.rest1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Rest1RestController {

    DataController dataController = new DataController();

    @RequestMapping(value = "/getData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public DataController.Data getData() {
        return dataController.getData();
    }

    @RequestMapping(value = "/getData", method = RequestMethod.POST/*, consumes = MediaType.TEXT_PLAIN_VALUE*/)
    public void setData(@RequestBody DataController.Data data) {
        dataController.setData(data);
        System.out.println(dataController.getData());
    }
}
