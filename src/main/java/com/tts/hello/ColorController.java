package com.tts.hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Add a @Controller annotation to make this a class that
//processes incoming web requests
@Controller
public class ColorController
{
    //Add a "Mapping" so that when people visit "/color" on our
    // site this method is called
    @GetMapping("/color") //handles HTTP get requests.
    public String greeting(Color color, Model model)
    {
        model.addAttribute("color", color);
        return "color";
    }
    @PostMapping(value="/color")
    public String greetingSubmit (Color color, Model model) 
    {
      model.addAttribute("color", color);
      return "result";
    }
}
