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

    @PostMapping("/greeting")
    @ResponseBody
    public Rectangle greetingSubmit(@ModelAttribute Greeting greeting) {
        return new Rectangle(greeting.getWidth(), greeting.getHeight());
    }

}
