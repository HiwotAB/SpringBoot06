package hiwotab.springboot_06.controller;

import hiwotab.springboot_06.Model.Song;
import jdk.nashorn.internal.runtime.ErrorManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

// controller class is used as intermidate to our model  to the data base
@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
    @RequestMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song",new Song());
        return "songform";
    }
    @PostMapping("/songform")
    public String loadFormPage(@Valid @ModelAttribute("newSong") Song song,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "songform";
        }
        return "confirmsong";
    }

}