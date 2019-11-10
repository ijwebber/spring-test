package com.example.test.controllers;

import com.example.test.models.HelloLog;
import com.example.test.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloForm(Model model) {
        model.addAttribute("title", "Hello: Form");
        return "helloform";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String index(HttpServletRequest request, Model model) {

        //get from the ? part of the url
        String name = request.getParameter("name");

        if (name == null || name == "") {
            name = "world";
        }

        HelloLog log = new HelloLog(name);

        model.addAttribute("title", "Hello: Response");
        model.addAttribute("message", HelloMessage.getMessage(name));
        return "hello";
    }
}
