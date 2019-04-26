package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        if(greeting.getHeight() <= 0 || greeting.getWidth() <= 0){
            greeting.setSquare(0);
            greeting.setPerimeter(0);
        } else{
            greeting.setSquare(greeting.getHeight() * greeting.getWidth());
            greeting.setPerimeter(2 * (greeting.getHeight() + greeting.getWidth()));
        }
        return "result";
    }

}