package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("")
public class SkillsController {

    @GetMapping("")
    public String skillsTracker(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>HTML</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "<a href='http://localhost:8080/form'> Choose your  skills! </a>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm(){
                return "<html>" +
                "<body>" +
                        "<form action = 'chosenSkills' method = 'post'>" +
                        "<label = 'name'>Name: </label><br>" +
                "<form action = 'hello' method = 'post'>" +
                "<input type = 'text' name = name><br><br>" +
                        "<a>My Favorite Language:</a><br>" +
                "<select name = 'favoriteLanguage' label = 'My Favorite Language'>" +
                        "<option value = 'JavaScript' label = 'JavaScript'/>" +
                        "<option value = 'Html' label = 'HTML'/>" +
                        "<option value = 'Java' label = 'Java'/>" +
                        "</select><br>" +
                        "<a>My Second Favorite Language:</a><br>" +
                        "<select name = 'secondLanguage' label = 'My Second Favorite Language'>" +
                        "<option value = 'JavaScript' label = 'JavaScript'/>" +
                        "<option value = 'Html' label = 'HTML'/>" +
                        "<option value = 'Java' label = 'Java'/>" +
                        "</select><br>" +
                        "<a>My Third Favorite Language</a><br>" +
                        "<select name = 'thirdLanguage' label = 'My Third Favorite Language'>" +
                        "<option value = 'JavaScript' label = 'JavaScript'/>" +
                        "<option value = 'Html' label = 'HTML'/>" +
                        "<option value = 'Java' label = 'Java'/>" +
                        "</select><br><br>" +
                        "<input type = 'submit' value = 'Submit'>" +
                        "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "chosenSkills")
    public String finalSkillsSelection(@RequestParam String name, String favoriteLanguage, String secondLanguage, String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favoriteLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>";
    }


}
