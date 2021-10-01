package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsHTML (){
        return "<html>" +
                  "<body>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                     "<ol>" +
                      "<li>JavaScript</li>" +
                      "<li>Java</li>" +
                      "<li>Python</li>" +
                     "</ol>" +
                  "</body>" +
                "</html>" ;
    }
    @GetMapping("form")
    @ResponseBody
    public String skillForm(){
        return  "<html>" +
                    "<body>" +
                "<form action = 'formresult'>" +
                    "<h2>Name:</h2>" +
                       "<input type='text' name='name'>" +
                    "<h2>My First Favorite Language</h2>" +
                        "<select name='selection1'>" +
                        "<option>JavaScript</option>" +
                        "<option>Java</option>" +
                        "<option>Python</option>" +
                        "/<select>" +
                    "<h2>My Second Favorite Language</h2>" +
                        "<select name='selection2'>" +
                        "<option>JavaScript</option>" +
                        "<option>Java</option>" +
                        "<option>Python</option>" +
                        "</select>" +
                    "<h2>My Third Favorite Language</h2>" +
                        "<select name='selection3'>" +
                        "<option>JavaScript</option>" +
                        "<option>Java</option>" +
                        "<option>Python</option>" +
                        "</select>" +
                    "<br>" +
                "<input type='submit' value='submit'>" +
                "</form>" +
                    "</body>" +
                "</html>";
    }

    //@RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("formresult")
    @ResponseBody
    public String formResults(@RequestParam String name, String selection1, String selection2, String selection3){
        return
                "<html>" +
                        "<body><b>" +
                            "<h1>" + name + "</h1>" +
                            "<br>" +
                            "<ol>" +
                            "<li>" + selection1 + "</li>" +
                            "<li>" + selection2 + "</li>" +
                            "<li>" + selection3 + "</li>" +
                            "</ol>" +
                        "</b></body>" +
                        "</html>";
    }
}
