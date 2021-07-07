package com.example.dadjokes;

import java.util.ArrayList;
import java.util.List;

public class jokeMan {
    List<String> getJokes(String joke) {
        List<String> jokes = new ArrayList<>();
        switch(joke) {
            case "What did the zero say to the eight?":
            {
                jokes.add("That belt looks good on you!");
                break;
            }
            case "Where do you learn to make a banana split?":
            {
                jokes.add("Sundae school");
                break;
            }
            case "Where do fruits go on vacation?":
            {
                jokes.add("Pear-is!");
                break;
            }
            case "Why do seagulls fly over the ocean?":
            {
                jokes.add("Because if they flew over the bay, we'd call them bagels.");
                break;
            }
            case "What do you call a poor Santa Clause?":
            {
                jokes.add("St. Nickel-less");
                break;
            }
            case "How many tickles does it take to make an octopus laugh?":
            {
                jokes.add("Ten tickles") ;
                break;
            }
            case "What concert costs just 45 cents?":
            {
                jokes.add("50 Cent featuring Nickeback!");
                break;
            }
            case "What country capital is growing the fastest?":
            {
                jokes.add("Ireland.  Every day it's Dublin.");
                break;
            }
        }
        return jokes;
    }
}
