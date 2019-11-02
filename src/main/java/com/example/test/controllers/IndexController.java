package com.example.test.controllers;

import com.example.test.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model) {

        //get from the ? part of the url
        String name = request.getParameter("name");

        if (name == null) {
            name = "world";
        }

        model.addAttribute("name", HelloMessage.getMessage(name));
        return "index";
    }
}
