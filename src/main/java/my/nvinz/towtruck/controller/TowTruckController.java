package my.nvinz.towtruck.controller;

import my.nvinz.towtruck.data.Data;
import my.nvinz.towtruck.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
public class TowTruckController {

    @Autowired
    private DataService dataService;

    @RequestMapping(value = "/getData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Data getData() {
        return dataService.getData("1"); // hardcode
    }

    @RequestMapping(value = "/getData", method = RequestMethod.POST/*, consumes = MediaType.TEXT_PLAIN_VALUE*/)
    public void setData(@RequestBody Data data) {
        dataService.setData(data);
    }
}
