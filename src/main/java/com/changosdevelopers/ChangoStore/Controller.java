package com.changosdevelopers.ChangoStore;

import com.changosdevelopers.ChangoStore.Class.Articles;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/Articles")
    public String home(){
        return "pages/ArticlesPage";
    }

    @GetMapping("/articulos")
    public String getArticules(Model model){
        List<Articles> articulos = new ArrayList<>();
        articulos.add(new Articles("Laptop",999));
        articulos.add(new Articles("La",123));
        articulos.add(new Articles("LaAWDAWd",1123));

        model.addAttribute("lista",articulos);

        return "pages/ArticlesPage";
    }
}
