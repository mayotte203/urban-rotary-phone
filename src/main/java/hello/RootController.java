package hello;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class RootController {

    @RequestMapping(value="/sample", method = RequestMethod.POST)
    @ResponseBody
    public String action(@RequestParam(value = "param[]") String[] paramValues) {
        return paramValues[paramValues.length - 1];
    }
}
