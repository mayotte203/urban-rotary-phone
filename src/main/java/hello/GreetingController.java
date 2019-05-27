package hello;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value = "/negativeNumberIndexes", method = RequestMethod.POST)
    public @ResponseBody
    int[] negativeNumberIndexes(@RequestBody NumbersInput input) {
        return  IntStream.rangeClosed(0,input.getNumbers().length-1).filter(s ->input.getNumbers()[s] < 0).toArray();
    }

    @RequestMapping(value = "/doublesAverage", method = RequestMethod.POST)
    public @ResponseBody
    double doublesAverage(@RequestBody DoublesInput input) {
        return input.getDoubles().stream().mapToDouble(d -> d).average().getAsDouble();
    }

    @RequestMapping(value = "/listToString", method = RequestMethod.POST)
    public @ResponseBody
    String listToString(@RequestBody ListInput input) {
        return input.getList().stream().filter(s -> s.matches("[A-Z].*")).collect(Collectors.joining(" "));
    }
}


