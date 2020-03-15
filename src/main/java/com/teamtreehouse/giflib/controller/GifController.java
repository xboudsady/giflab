package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @RequestMapping("/")               // Handles request to our main or home page
    public String listGifs() {
        return "home";                 // Returns page from main/resources/templates/home.html
    }



}
