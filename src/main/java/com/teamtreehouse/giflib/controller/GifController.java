package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping("/")               // Handles request to our main or home page
    public String listGifs() {
        return "home";                 // Returns page from main/resources/templates/home.html
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        // Construct a new Gif Object so our view has access
        Gif gif = new Gif("compiler-bot", LocalDate.of(2020,3,15), "Seth Boudsady", true);
        // Add to modelMap
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
