package com.exemplo.medtracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MedicationController {

    @Autowired
    private MedicationRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("medications", repository.findAll());
        model.addAttribute("newMedication", new Medication());
        return "index";
    }

    @PostMapping("/add")
    public String addMedication(@ModelAttribute Medication medication) {
        repository.save(medication);
        return "redirect:/"; // Atualiza a página após salvar
    }
}
