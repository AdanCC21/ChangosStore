package com.changosdevelopers.ChangoStore;

import com.changosdevelopers.ChangoStore.Class.Articles;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/Articles")
    public String getArticules(Model model){
        List<Articles> articulos = new ArrayList<>();
        articulos.add(new Articles("Laptop",999));
        articulos.add(new Articles("Tablet",123));
        articulos.add(new Articles("Celular",1123));
        articulos.add(new Articles("Iphone",1123));
        articulos.add(new Articles("Pc",1123));
        articulos.add(new Articles("Pescado",1123));
        articulos.add(new Articles("Pollo",1123));
        articulos.add(new Articles("Moto",1123));
        articulos.add(new Articles("UABC",1123));
        articulos.add(new Articles("Escuela primaria secundaria tecinca numero 23",1123));
        articulos.add(new Articles("Hola",1123));

        model.addAttribute("lista",articulos);

        return "pages/ArticlesPage";
    }
}
