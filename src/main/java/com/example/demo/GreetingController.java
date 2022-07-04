package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GreetingController {

    @GetMapping("/processForm")
    public String greetings(@RequestParam("studentName") String theName,
                            Model model) {
        //model.addAttribute("studentName", name);
       // String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String name2 = theName + " second";

        model.addAttribute("naame",theName);
        model.addAttribute("name2",name2);

        return "greeting";
    }

/*
    @GetMapping("/processForm")
    public String processForm(){return "greeting"; }
*/
    @GetMapping("/helloForm")
    public String helloForm() {
        return "helloForm";
    }



}
