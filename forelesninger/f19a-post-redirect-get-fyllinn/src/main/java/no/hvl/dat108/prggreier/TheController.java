package no.hvl.dat108.prggreier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TheController {

    @PostMapping("/skjema")
    public String skjema(String navn, Model model) {
        model.addAttribute("navn", navn);   //Blir lagt til model i denne requesten
        return "kvitteringView";
    }
}
