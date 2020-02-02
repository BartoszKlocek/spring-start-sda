package com.example.demo;

import com.example.demo.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "sample text";
    }

    //zwraca zawartosc pliku home.jsp
    @GetMapping("/home")
    public String homeExampleJspFile(Model model) {
        model.addAttribute("name", "Junior Software Developer");

        model.addAttribute("project", Project.builder().name("nowy").startDate(new Date()).team(2));

        model.addAttribute("projects", projectRepository.getProjects());

        return "home";
    }

}
