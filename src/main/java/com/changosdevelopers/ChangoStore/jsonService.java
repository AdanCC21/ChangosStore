package com.changosdevelopers.ChangoStore;

import com.changosdevelopers.ChangoStore.Class.Articles;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class jsonService {
    private final ObjectMapper obj = new ObjectMapper();

    public List<Articles> getJsonArticules() throws IOException {
        //Cargar el archivo desde resources
        File json = new File(getClass().getClassLoader().getResource("articles.json").getFile());

        // Lee el archivo y lo convierte en una lista de objetos articulos
        return obj.readValue(json, new TypeReference<List<Articles>>() {});
    }
}