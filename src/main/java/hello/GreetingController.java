package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value = "/rectangle" , method = RequestMethod.POST)
    public @ResponseBody Rectangle rectangleResponse(@RequestBody Rectangle jsonRectangel) {
        return jsonRectangel;
    }

    @RequestMapping(value = "/power" , method = RequestMethod.POST)
    public @ResponseBody Power rectangleResponse(@RequestBody Power jsonPower) {
        return jsonPower;
    }

    @RequestMapping(value = "/findnumbers" , method = RequestMethod.POST)
    public @ResponseBody FindNumbers rectangleResponse(@RequestBody FindNumbers jsonFindNumbers) {
        return jsonFindNumbers;
    }
}


