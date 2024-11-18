package com.changosdevelopers.ChangoStore;
import com.changosdevelopers.ChangoStore.Class.Articles;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    // Variable para manejar la interaccion con el archivo json
    private final jsonService jsonConnect = new jsonService();

    // Constructor
//    public Controller(jsonService json){
//        this.jsonConnect = json;
//    }

    @GetMapping("/Articles")
    public  String showArticles(Model mod){
        try {
            // Traer archivos
            List<Articles> articulos = jsonConnect.getJsonArticules();
            mod.addAttribute("listaArticulos",articulos);
        } catch (Exception e) {
            e.printStackTrace();
            mod.addAttribute("error","File not loaded");
        }
        return "pages/ArticlesPage";
    }


    @GetMapping("/article/{name}/{price}")
    public String articleInfo(@PathVariable String name,@PathVariable double price,Model model){
        Articles artSelected = new Articles(name,price);
        model.addAttribute("articulo",artSelected);
        return "pages/ArticleInfo";
    }
}
