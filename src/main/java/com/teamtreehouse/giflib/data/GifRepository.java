package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", 1, LocalDate.of(2015,2,13), "Chris Ramacciotti", false),
        new Gif("ben-and-mike", 2, LocalDate.of(2015,10,30), "Ben Jakuben", true),
        new Gif("book-dominos", 3, LocalDate.of(2015,9,15), "Craig Dennis", false),
        new Gif("compiler-bot", 3, LocalDate.of(2015,2,13), "Ada Lovelace", true),
        new Gif("cowboy-coder", 1, LocalDate.of(2015,2,13), "Grace Hopper", false),
        new Gif("infinite-andrew", 2, LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    // Create a public method to access our private data list
    public Gif findByName(String name) {
        // Iterate through list objects, using for each loop...
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    // Public access to our private data list
    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    // Loops through our list to find item with category ID
    public List<Gif> findByCategoryId(int id) {
        // Initiatlize a brand new empty list
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

}
