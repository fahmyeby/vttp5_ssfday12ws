package sg.edu.nus.iss.vttp5a_day12ws.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumberController {
    @GetMapping("/")
    public String showForm(){
        return "index";
    }
    @GetMapping("/generate")
    public String generateNumber(@RequestParam("count") int count, Model model){
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            randomNumbers.add(i);
        }

        Collections.shuffle(randomNumbers);
        randomNumbers = randomNumbers.subList(0, count);

        model.addAttribute("randomNumbers", randomNumbers);

        return "result";
    }
}