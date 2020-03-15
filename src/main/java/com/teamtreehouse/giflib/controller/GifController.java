package com.teamtreehouse.giflib.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")                                    // Handles request to our main or home page
    public String listGifs(ModelMap modelMap) {
        List<Gif> allGifs = gifRepository.getAllGifs();     // Get all data from our data list
        modelMap.put("gifs", allGifs);                      // Puts all the gif objects into our moelMap, so our thymeleaf have access
        return "home";                                      // Returns page from main/resources/templates/home.html
    }


    // URL => http://localhost:8080/gif/android-explosion
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);      // Construct a new Gif Object so our view has access
        modelMap.put("gif", gif);                      // Add to modelMap
        return "gif-details";
    }

}
