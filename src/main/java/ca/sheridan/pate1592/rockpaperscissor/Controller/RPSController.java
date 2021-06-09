package ca.sheridan.pate1592.rockpaperscissor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class RPSController {


    @GetMapping("/index")
    public String Index() {

        return "Input.html";
    }


    @GetMapping("/Input")
    public String Input() {

        return "Input";

    }

    @GetMapping("/Output")
    public String Output() {
//            @RequestParam String rock,
//            @RequestParam String paper,
//            @RequestParam String scissors,
//            Model model) {
//
//        model.addAttribute("rock", rock);
//        model.addAttribute("paper", paper);
//        model.addAttribute("scissors", scissors);

        return "Output";
    }
}



