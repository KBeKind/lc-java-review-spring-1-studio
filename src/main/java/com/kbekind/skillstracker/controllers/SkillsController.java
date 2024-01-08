package com.kbekind.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsIntro(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>This my skills tracker</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @PostMapping("form-done")
    @ResponseBody
    public String skillsFormPost(@RequestParam String name, @RequestParam String prog1, @RequestParam String prog2, @RequestParam String prog3){

        return "<html>" +
                "<head>" +
                "<style>" +
                "th, td { border: 1px solid #dddddd; text-align: left; padding: 8px; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h1>" + name +  "</h1>" +
                "<ol>" +
                "<li>"+ prog1 +"</li>" +
                "<li>"+ prog2 +"</li>" +
                "<li>"+ prog3 +"</li>" +
                "</ol>" +
                "<br>" +
                "<table>" +
                "<thead>" +
                "<tr>" +
                "<th>Rank</th>" +
                "<th>Prog Lang</th>" +
                "</tr>" +
                "</thead>" +
                "<tbody>" +
                "<tr>" +
                "<td>1</td>" +
                "<td>"+ prog1 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>2</td>" +
                "<td>"+ prog2+"</td>" +
                "</tr>" +
                "<tr>" +
                "<td>3</td>" +
                "<td>"+ prog3+"</td>" +
                "</tr>" +
                "</tbody>" +
                "</table>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsFormGet() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method='post' action='/form-done'>" +
                        "Name: <input type='text' name='name'>" +
                        "<br>" +
                        "<br>" +
                        "<label for='prog-select-1'>My Fav Lang</label>" +
                        "<br>" +
                        "<select name='prog1' id='prog-select-1'>" +
                        "<option value='Java'>Java</option>" +
                         "<option value='JavaScript'>JavaScript</option>" +
                          "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br>" + "<br>" +
                        "<label for='prog-select-2'>My 2nd Fav Lang</label>" +
                        "<br>" +
                        "<select name='prog2' id='prog-select-2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br>" + "<br>" +
                        "<label for='prog-select-3'>My 3rd Fav Lang</label>" +
                        "<br>" +
                        "<select name='prog3' id='prog-select-3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +
                        "<input type='submit' value='submit'>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
