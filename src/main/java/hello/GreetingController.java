package hello;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value = "/rectangle" , method = RequestMethod.POST)
    public @ResponseBody List<Integer[]> rectangleResponse(@RequestBody List<Rectangle> jsonRectangel) {
        List<Integer[]> result = new ArrayList<Integer[]>();
        jsonRectangel.forEach(e -> result.add(new Integer[]{2 * (e.getHeight() + e.getHeight()),e.getHeight() * e.getHeight()}));
        return result;
    }

    @RequestMapping(value = "/power" , method = RequestMethod.POST)
    public @ResponseBody int powerResponse(@RequestBody Power jsonPower) {
        return (int)Math.pow(jsonPower.getNumber(), jsonPower.getPower());
    }

    @RequestMapping(value = "/findnumbers" , method = RequestMethod.POST)
    public @ResponseBody int[] findNumbersResponse(@RequestBody Bounds jsonBounds) {
        return IntStream.rangeClosed((int)Math.sqrt(jsonBounds.getFrom()), (int)Math.sqrt(jsonBounds.getTo())).toArray();
    }
}


