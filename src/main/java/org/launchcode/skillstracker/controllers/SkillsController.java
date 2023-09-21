package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String createHomePage()
    {
        return "<html>" +
                "<body>" +
                "<form action = '/submit' method = 'post'>" + // submit a request to /hello
                "<h1>Skills Tracker</h1>"+
                "<h2>We have a few skills we would like to learn. Here is the list!</h2><h3>" +
                "<ol>"+
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol></h3>"+
                "Name: <br/><input type = 'text' name = 'name' ><br/>" +
                "My favorite language:<br/><select name='firstlanguage'>" +
                    "<option value='Java'>Java</option>"+
                    "<option value='JavaScript'>JavaScript</option>"+
                    "<option value='Python'>Python</option>"+
                "</select><br/>" +
                "My Second favorite language:<br/><select name='secondlanguage'>" +
                "<option value='Java'>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br/>" +
                "My third favorite language:<br/><select name='thirdlanguage'>" +
                "<option value='Java'>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br/>" +
                "<input type = 'submit' value = 'Submit' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "submit", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String formSubmit(@RequestParam String name,@RequestParam String firstlanguage,@RequestParam String secondlanguage,@RequestParam String thirdlanguage) {
        return "<html><body><h1>"+name+"</h1><br/>"+
                "<h3><ol><li>"+firstlanguage + "</li>" +
                "<li>"+secondlanguage + "</li>" +
                "<li>"+thirdlanguage + "</li></ol></h3></body></html>";

        //return "Hello";

    }

}
