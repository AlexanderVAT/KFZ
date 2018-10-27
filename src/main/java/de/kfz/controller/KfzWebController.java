package de.kfz.controller;

import de.kfz.model.Client;
import de.kfz.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KfzWebController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("client", new Client());
        return "index";
    }

    @PostMapping("/result")
    public String clientSubmit(Model model, @ModelAttribute Client client) {
        model.addAttribute("name", client.getName());
        model.addAttribute("age", client.getAge());
        clientRepository.save(client);
        return "result";
    }

}

