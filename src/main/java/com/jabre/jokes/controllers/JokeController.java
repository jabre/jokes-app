package com.jabre.jokes.controllers;

import com.jabre.jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : Jabre
 * Created : 12/5/2021, Sunday
 **/
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
