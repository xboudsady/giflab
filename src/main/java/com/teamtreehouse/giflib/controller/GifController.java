package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    // Handles request to our main or home page
    @RequestMapping("/")
    // Returns the following, and arbitrary string...
    @ResponseBody
    public String listGifs() {
        return "List of all the GIFs!";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String listGifsAgain() {
        return "Listing of all GIFs again!";
    }

}
