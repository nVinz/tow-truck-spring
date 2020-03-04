package my.nvinz.rest1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Rest1RestController {


    @RequestMapping(value = "/getData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getData() {
        Response response = new Response();
        response.setLat("1");
        response.setLon("2");
        return response;
    }

    @PostMapping("/employees")
    public void setData(@RequestBody Response response) {
    }
}
